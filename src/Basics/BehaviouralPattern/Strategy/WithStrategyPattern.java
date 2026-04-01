package Basics.BehaviouralPattern.Strategy;

interface PaymentStrategy{
    void processPayment();
}
class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Doing Payment via CreditCard");
    }
}
class DebitCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Doing Payment via DebitCard");
    }
}
class UPI implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Doing Payment via UPI");
    }
}
class PaymentService {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.strategy=paymentStrategy;
    }
    public void pay(){
        strategy.processPayment();  //polymorphic behaviour
    }
}

public class WithStrategyPattern {
    static void main() {
        CreditCard creditCard= new CreditCard();
        PaymentService paymentService=new PaymentService();
//        paymentService.setPaymentStrategy(creditCard);
        paymentService.setPaymentStrategy(new UPI());
        paymentService.pay();

    }
}
