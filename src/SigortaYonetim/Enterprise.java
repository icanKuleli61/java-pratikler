package SigortaYonetim;

import SigortaYonetim.Police.Insurance;

public class Enterprise extends Account {

    public Enterprise(User user) {
        super(user);
    }


    @Override
    public void addInsurance(Insurance insurance) {

        double newPrice = insurance.getPolicePrice() * 1.2; // %20 kar marjı
        insurance.setPolicePrice(newPrice);
        getInsurances().add(insurance);

        System.out.println("Kurumsal müşteriye sigorta eklendi: " + insurance.getPoliceName() +
                ", Güncel Ücret: " + insurance.getPolicePrice());

    }
}
