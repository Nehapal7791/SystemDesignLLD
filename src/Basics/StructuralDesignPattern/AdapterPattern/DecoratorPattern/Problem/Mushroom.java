package Basics.StructuralDesignPattern.AdapterPattern.DecoratorPattern.Problem;

public class Mushroom extends OliveCheesePizza{

    @Override
    public String getDescription() {
        return super.getDescription() + " Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }
}
