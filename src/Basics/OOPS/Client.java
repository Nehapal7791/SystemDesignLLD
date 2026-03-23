package Basics.OOPS;

public class Client {

    static void main() {
        PaymentService p= new PaymentService();
        p.addPaymentMethod("NehaCredit", new CreditCard("Neha","7828727833219"));
        p.addPaymentMethod("NehaDebit",new DebitCard("Neha","98292829383"));
        p.addPaymentMethod("NehaUPI",new UPI("1223213231"));
        p.addPaymentMethod("NehaWallet",new Wallet("Neha#3828974"));
        p.makePayment("NehaUPI");
    }
}
