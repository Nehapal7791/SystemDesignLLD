package Basics.SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
    private NotificationChannel notificationChannel;
    NotificationService(NotificationChannel channel){
        this.notificationChannel=channel;
    }
    public void notify(String msg){
        notificationChannel.send(msg);
    }
}
