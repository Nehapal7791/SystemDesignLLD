package Basics.CreationPattern.SingletonPattern.Without;

public class AppSettings {
    private String apiKey;
    private String databaseUrl;

    public AppSettings(){
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}

