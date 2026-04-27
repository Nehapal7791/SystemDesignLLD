package Basics.BehaviouralPattern.StateMachine.Problem;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService= new DirectionService(TransportationMode.CAR);
        directionService.setMode(TransportationMode.TRAIN);
        System.out.println(directionService.getDirection());
        directionService.getETA();

    }
}
