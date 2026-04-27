package Basics.BehaviouralPattern.StateMachine.Solution;

public class Cycling implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for cycling 5");
        return 5;
    }

    @Override
    public String getDirection() {
        return "direction for cycling";
    }
}
