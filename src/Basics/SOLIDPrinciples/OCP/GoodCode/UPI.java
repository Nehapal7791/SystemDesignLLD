package Basics.SOLIDPrinciples.OCP.GoodCode;


public class UPI implements PaymentMethod {

    @Override
    public void pay(int amount) {
        System.out.println("Payment using UPI.."+amount);
    }
}
