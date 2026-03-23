package Basics.SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(int amount) {
        //long piece of code for business logic
        System.out.println("Making payment via CreditCard.. "+amount);
    }
}
