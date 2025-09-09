package SigortaYonetim.Police;

public abstract class Insurance {
    private String policeName;
    private Double policePrice;
    private String policeStartDate;
    private String policeEndDate;


    public abstract double calculateInsurance();

    public Insurance(String policeName, Double policePrice, String policeStartDate, String policeEndDate) {
        this.policeName = policeName;
        this.policePrice = policePrice;
        this.policeStartDate = policeStartDate;
        this.policeEndDate = policeEndDate;
    }


    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public Double getPolicePrice() {
        return policePrice;
    }

    public void setPolicePrice(Double policePrice) {
        this.policePrice = policePrice;
    }

    public String getPoliceStartDate() {
        return policeStartDate;
    }

    public void setPoliceStartDate(String policeStartDate) {
        this.policeStartDate = policeStartDate;
    }

    public String getPoliceEndDate() {
        return policeEndDate;
    }

    public void setPoliceEndDate(String policeEndDate) {
        this.policeEndDate = policeEndDate;
    }
}

