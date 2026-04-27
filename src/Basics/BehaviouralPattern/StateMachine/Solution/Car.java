package Basics.BehaviouralPattern.StateMachine.Solution;

public class Car implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Car)");
        return 3;
    }

    @Override
    public String getDirection() {
        return "Directions for driving: Use highway 50 towards downtown.";
    }
}
