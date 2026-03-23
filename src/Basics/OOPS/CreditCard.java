package Basics.OOPS;

public  class CreditCard extends Card{

    public CreditCard(String Username, String CardNo) {
        super(Username, CardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making Payments via CreditCard");
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance of credit card"+34343);
    }
}
