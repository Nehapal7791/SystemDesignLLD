package Basics.SOLIDPrinciples.OCP.BadCode;

//open close principle(OCP) only followed when classes(or modules and functions) are open for extension closed for modification
public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount)
    {
        if(paymentMethod.equals("Credit Card"))
        {
            System.out.println("Payment done via credit card.." + amount);
        }
        else if(paymentMethod.equals("Debit Card"))
        {
            System.out.println("Payment done via Debit card.."+amount);
        }
        else if(paymentMethod.equals("UP")){
        System.out.println("Payment done via UPI..");
        }
        else{
            throw new IllegalArgumentException("Unsupported Payment Method.." + paymentMethod);
        }

    }
}
