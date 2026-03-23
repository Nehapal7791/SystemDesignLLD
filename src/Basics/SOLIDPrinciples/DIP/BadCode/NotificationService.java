package Basics.SOLIDPrinciples.DIP.BadCode;


//tightly couple, less flexible
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;
    public NotificationService(){
        this.emailService=new EmailService();
        this.smsService= new SMSService();
    }
    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }
    public void notifyBySMS(String msg){
        smsService.sendEmail(msg);
    }
}
