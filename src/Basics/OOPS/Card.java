package Basics.OOPS;


public abstract class Card implements PaymentMethod{
    private String CardNo;
    private String UserName;


    public Card(String Username, String CardNo){
        this.UserName=Username;
        this.CardNo=CardNo;

    }
    public String getCardNo() {
        return CardNo;
    }

    public String getUserName() {
        return UserName;
    }
}
