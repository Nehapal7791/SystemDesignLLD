package Basics.CreationPattern.FactoryPattern.Solution;

import Basics.CreationPattern.FactoryPattern.Solution.Transport;

public class Bus implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver Bus");
    }
}
