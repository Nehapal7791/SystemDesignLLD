package Basics.SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, int amount)
    {
        paymentMethod.pay(amount);

    }
}
