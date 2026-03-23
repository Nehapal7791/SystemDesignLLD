package Basics.SOLIDPrinciples.DIP.GoodCode;

public class WhtsappService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("sending whtsapp ...."+ msg);
    }
}
