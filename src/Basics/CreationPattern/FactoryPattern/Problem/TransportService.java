package Basics.CreationPattern.FactoryPattern.Problem;

public class TransportService {
    static void main() {
        //Direct create objects
        Transport car = new Car();
        Transport bike = new Bike();
        //add a bus object -- Tightly coupling of objects and violation of open closed principle
        Transport bus = new Bus();
    }
}
