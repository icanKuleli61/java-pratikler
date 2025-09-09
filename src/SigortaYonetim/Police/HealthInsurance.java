package SigortaYonetim.Police;

public class HealthInsurance extends Insurance {
    //Sağlık Sigortası
    public HealthInsurance(String policeName, Double policePrice, String policeStartDate, String policeEndDate) {
        super(policeName, policePrice, policeStartDate, policeEndDate);
    }

    @Override
    public double calculateInsurance() {
        this.setPolicePrice(this.getPolicePrice()* 1.10);
        return this.getPolicePrice();
    }
}
