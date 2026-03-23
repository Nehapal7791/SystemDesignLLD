package Basics.SOLIDPrinciples.OCP.GoodCode;


public class DebitCard implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Making payment via Debit Card amount.."+amount);
    }
}
