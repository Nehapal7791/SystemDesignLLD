package Basics.BehaviouralPattern.StateMachine.Solution;


public class WithStatePattern {
    static void main(String[] args) {
        DirectionService service= new DirectionService(new Car());
        service.setTransportationMode(new Cycling());

        System.out.println("ETA: " + service.getETA());
        System.out.println("Direction: " + service.getDirection());
    }
}
