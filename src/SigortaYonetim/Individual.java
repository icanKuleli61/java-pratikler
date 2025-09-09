package SigortaYonetim;

import SigortaYonetim.Police.Insurance;

public class Individual extends Account {

    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {

        double newPrice = insurance.getPolicePrice() * 1.1;
        insurance.setPolicePrice(newPrice);
        getInsurances().add(insurance);
        System.out.println("Bireysel müşteriye sigorta eklendi: " + insurance.getPoliceName() +
                ", Güncel Ücret: " + insurance.getPolicePrice());

    }
}
