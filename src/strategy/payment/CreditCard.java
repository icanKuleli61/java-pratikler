package strategy.payment;

public class CreditCard implements IPayment{

    private static final String payName = "CreditCard";

    @Override
    public void pay(int amount) {
        System.out.println(payName + " İle " + amount + "TL ödeme yapıldı");
    }
}
