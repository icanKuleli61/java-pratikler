package SigortaYonetim.Police;

public class CarInsurance extends Insurance {

    //otomobil sigortası

    public CarInsurance(String policeName, Double policePrice, String policeStartDate, String policeEndDate) {
        super(policeName, policePrice, policeStartDate, policeEndDate);
    }

    @Override
    public double calculateInsurance() {
        this.setPolicePrice(this.getPolicePrice()*1.15);
        return this.getPolicePrice();
    }

}
