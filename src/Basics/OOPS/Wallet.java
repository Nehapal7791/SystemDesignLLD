package Basics.OOPS;

public class Wallet implements PaymentMethod {
    private String walletId;
    Wallet(String walletId){
        this.walletId=walletId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via wallet");
    }
    @Override
    public void displayBalance() {
        System.out.println("Balance of Wallet is: "+9292);
    }
}
