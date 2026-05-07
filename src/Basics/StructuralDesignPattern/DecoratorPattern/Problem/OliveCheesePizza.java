package Basics.StructuralDesignPattern.DecoratorPattern.Problem;

public class OliveCheesePizza extends CheesePizza {
    @Override
    public String getDescription() {
        return super.getDescription()+ " Olive";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.50;
    }
}
