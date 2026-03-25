package Basics.BehaviouralPattern.ObserverPattern;

import java.util.ArrayList;

//Observer interface
interface Observer{
     void update(float temp);
}
//Subject interface
interface Subject{
    void attact(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}
class WeatherStationIn implements Subject{
    private float temperature;

    ArrayList<Observer> observerList= new ArrayList<>();

    public WeatherStationIn( ){
         observerList= new ArrayList<>();
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attact(Observer obs) {
     observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
    observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observerList){
            obs.update(temperature); //run time polymorphism
        }
    }
}

class DisplayDeviceIn implements Observer{
    String name;
    public DisplayDeviceIn (String deviceName){
        this.name=deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name +" device is "+temp);
    }
}
class MobileDevice implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is "+temp);
    }
}

public class WithObserverPattern {
    static void main() {
        DisplayDeviceIn device= new DisplayDeviceIn("Mobile");
        WeatherStationIn weatherStation= new WeatherStationIn();
        MobileDevice mobileDevice= new MobileDevice();
        weatherStation.attact(mobileDevice);
        weatherStation.attact(device);
        weatherStation.setTemperature(30);


    }
}
