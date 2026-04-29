package Basics.CreationPattern.SingletonPattern.With;

public class Main {
    static void main() {

        //AppSettings appSettings= new AppSettings();
        //AppSettings appSettings1=new AppSettings(); //cant create object
        AppSettings instance1=AppSettings.getInstance();
        AppSettings instance2 =AppSettings.getInstance();
        System.out.println(instance1==instance2); //true now
    }
}
