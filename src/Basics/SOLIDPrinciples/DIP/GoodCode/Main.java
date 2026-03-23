package Basics.SOLIDPrinciples.DIP.GoodCode;


public class Main {
    public static void main() {
        NotificationService notificationService= new NotificationService(new EmailService());
        notificationService.notify("Your order have been shipped");


        NotificationService notificationService1 = new NotificationService(new SMSService());
        notificationService1.notify("OTP is 45454");

        NotificationService notificationService2 = new NotificationService((new WhtsappService()));
        notificationService2.notify("Hello from whtsapp");

    }
}
