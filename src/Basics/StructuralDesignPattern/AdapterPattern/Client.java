package Basics.StructuralDesignPattern.AdapterPattern;

public class Client {
    static void main() {
        NotificationService emailService= new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");
        //NotificationService sendGridEmailService = new SendGridService();
        NotificationService mailServiceUsingSendGrid = new SendGridServiceAdapter(new SendGridService());
        mailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");
    }

}
