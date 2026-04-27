package Basics.BehaviouralPattern.MediatorPattern;

class User{
    String name;
    User(String name){
        this.name=name;
    }
    public void sendMessage(String msg, User recipient){
        System.out.println(this.name + " sending "+ msg + " to " + recipient.getName());
    }
    public String getName(){
        return name;
    }
}
public class Without {
    static void main() {
        User neha= new User("Neha");
        User rahul = new User("Rahul");
        User amit = new User("Amit");
        User deva= new User("Deva");
        //complex to handle multiple objects like this.
        neha.sendMessage("Hello",deva);
        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",neha);

    }
}
