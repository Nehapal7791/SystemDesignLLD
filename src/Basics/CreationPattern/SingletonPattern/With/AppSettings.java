package Basics.CreationPattern.SingletonPattern.With;

public class AppSettings {
    private String apiKey;
    private String databaseUrl;

    //    Step1: create instance object private static
    private static AppSettings instance;
    //    Step2: constructor should be private
    private AppSettings(){
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "12345-ABCDE";
    }
    //    step3: create a method to get new instance if instance is null, get single instance
    public static AppSettings getInstance(){
        if(instance==null){
            instance = new AppSettings();
        }
        return instance;
    }
}
