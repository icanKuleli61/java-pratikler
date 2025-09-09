package SigortaYonetim;

public class HomeAddress implements Address{

    private String homeAddress;

    public HomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }

    @Override
    public String getAddress() {
        return homeAddress;
    }

    @Override
    public void setAddress(String address) {
        this.homeAddress = address;
    }
}
