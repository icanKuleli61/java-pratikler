package strategy.payment;

public class Crypto implements IPayment {

    private static final String payName = "Crypto";

    @Override
    public void pay(int amount) {
        System.out.println(payName + " İle " + amount + "TL ödeme yapıldı");
    }
}
