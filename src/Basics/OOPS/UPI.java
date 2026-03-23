package Basics.OOPS;

public class UPI implements PaymentMethod {
    String UpiId;

    UPI(String UpiId){
        this.UpiId=UpiId;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment using upi "+UpiId);
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance of UPI is "+23324);
    }
}
