package Basics.BehaviouralPattern.StateMachine.Solution;

public class Walking implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for walking 10");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Directions for walking: Head north for 500 meters.";
    }
}
