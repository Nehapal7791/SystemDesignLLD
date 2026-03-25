package Basics.BehaviouralPattern.ObserverPattern;
class DisplayDevice{
    public void showTemp(float temp) {
        System.out.println("Current temperature is "+ temp);
    }
}

class WeatherStation{

    private float temperature;
    private DisplayDevice displayDevice; //can we multiple later on

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice= displayDevice;
    }
    public void setTemperature(float temp){
        this.temperature=temp;
        notifyDevice();
    }
    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }
}

public class WithoutObserverPattern {
    public static void main() {
        DisplayDevice displayDevice= new DisplayDevice();
        WeatherStation weatherStation= new WeatherStation(displayDevice);
        //tight coupling
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }

}
