package Basics.StructuralDesignPattern.AdapterPattern;

public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Sending Email to " + to);
        System.out.println("Title: " + subject);
        System.out.println("Content: " + body);
    }
}
