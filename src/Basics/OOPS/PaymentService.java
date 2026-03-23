package Basics.OOPS;

import java.util.HashMap;

public class PaymentService {
    //Making payment +storing
    HashMap<String, PaymentMethod> paymentMethods ;
    PaymentService(){
        paymentMethods= new HashMap<>();
    }
    public void addPaymentMethod(String name, PaymentMethod paymentMethod){
        paymentMethods.put(name,paymentMethod );
    }
    public void makePayment(String name){
        PaymentMethod p= paymentMethods.get(name);
        p.pay(); // Run Time polymorphism
//        p.displayBalance();
    }

}
