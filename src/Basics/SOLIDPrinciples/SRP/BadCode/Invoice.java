package Basics.SOLIDPrinciples.SRP.BadCode;
//Every single class should have on responsibility
public class Invoice {
    private  int amount;
    Invoice(int amount){
        this.amount=amount;
    }

    public void generateInvoice(){
        System.out.println("Generated invoice for amount"+amount);
    }
    public void saveInvoiceToDatabase( ){
        System.out.println("Saving invoice to database");
    }
    public void SendEmail(){
        System.out.println("Sending email notification for invoice...");
    }

}
