package Basics.StructuralDesignPattern.AdapterPattern;

public class SendGridServiceAdapter implements NotificationService{
    SendGridService service= new SendGridService();

    SendGridServiceAdapter(SendGridService service){
        this.service=service;
    }

    @Override
    public void send(String to, String subject, String body) {
        service.sendEmail(to,subject,body);
    }
}
