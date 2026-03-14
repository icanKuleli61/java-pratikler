package strategy.payment;

public class PayPal implements IPayment {

    private static final String payName = "PayPal";

    @Override
    public void pay(int amount) {
        System.out.println(payName + " İle " + amount + "TL ödeme yapıldı");
    }
}
