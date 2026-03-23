package Basics.OOPS;

public class DebitCard extends Card{
    public DebitCard(String Username, String CardNo) {
        super(Username, CardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via DebitCard");
    }

    @Override
    public void displayBalance() {
        System.out.println("balance of debit "+98292);
    }

}
