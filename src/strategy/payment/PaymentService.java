package strategy.payment;

public class PaymentService {

    private final IPayment payment;

    public PaymentService(IPayment payment) {
        this.payment = payment;
    }

    public  void pay(int amount) {
        payment.pay(amount);
    }

}


