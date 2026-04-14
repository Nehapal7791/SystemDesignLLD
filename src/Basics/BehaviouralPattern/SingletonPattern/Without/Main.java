package Basics.BehaviouralPattern.SingletonPattern.Without;

import Basics.BehaviouralPattern.SingletonPattern.Without.AppSettings;

public class Main {
    static void main() {
        AppSettings appSettings= new AppSettings();
        AppSettings appSettings1=new AppSettings();
        System.out.println(appSettings1==appSettings); //two different objects
    }
}
