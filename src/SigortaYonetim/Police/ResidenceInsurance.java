package SigortaYonetim.Police;

public class ResidenceInsurance extends Insurance {
    //konut sigortası

    public ResidenceInsurance(String policeName, Double policePrice, String policeStartDate, String policeEndDate) {
        super(policeName, policePrice, policeStartDate, policeEndDate);
    }

    @Override
    public double calculateInsurance() {
        this.setPolicePrice(this.getPolicePrice()*1.20);
        return this.getPolicePrice();
    }
}
