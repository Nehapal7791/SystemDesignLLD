package Basics.StructuralDesignPattern.AdapterPattern.DecoratorPattern.Problem;

public class BasicPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
