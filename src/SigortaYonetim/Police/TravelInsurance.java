package SigortaYonetim.Police;

public class TravelInsurance extends Insurance {

    //seyahat sigortası
    public TravelInsurance(String policeName, Double policePrice, String policeStartDate, String policeEndDate) {
        super(policeName, policePrice, policeStartDate, policeEndDate);
    }

    @Override
    public double calculateInsurance() {
        this.setPolicePrice(this.getPolicePrice()*1.05);
        return this.getPolicePrice();
    }
}
