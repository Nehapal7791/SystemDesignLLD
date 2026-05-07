package Basics.StructuralDesignPattern.DecoratorPattern.Problem;

public class CheesePizza extends BasicPizza {
    @Override
    public String getDescription() {
        return super.getDescription()+ " cheese";
    }

    @Override
    public double getCost() {
        return super.getCost()+1.00;
    }

}
