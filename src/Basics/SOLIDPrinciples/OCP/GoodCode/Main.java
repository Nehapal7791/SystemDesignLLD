package Basics.SOLIDPrinciples.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor p= new PaymentProcessor();
        p.processPayment(new CreditCard(),677);
        p.processPayment(new UPI(),9090);


    }
}

