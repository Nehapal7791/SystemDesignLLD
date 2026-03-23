package Basics.SOLIDPrinciples.SRP.GoodCode;

//Every single class should have on responsibility now its following (Single Responsibility Function)
public class Invoice {
    private  int amount;
    Invoice(int amount){
        this.amount=amount;
    }

    public void generateInvoice(){
        System.out.println("Generated invoice for amount"+amount);
    }
}

