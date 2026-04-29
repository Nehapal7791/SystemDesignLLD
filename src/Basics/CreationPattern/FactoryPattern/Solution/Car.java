package Basics.CreationPattern.FactoryPattern.Solution;

import Basics.CreationPattern.FactoryPattern.Solution.Transport;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver car");
    }
}
