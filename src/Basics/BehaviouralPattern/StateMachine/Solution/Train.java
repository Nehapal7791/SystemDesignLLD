package Basics.BehaviouralPattern.StateMachine.Solution;

public class Train implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calc ETA for train 4");
        return 4;
    }

    @Override
    public String getDirection() {
        return "Directions for train: Board the Red Line at Central Station.";
    }
}
