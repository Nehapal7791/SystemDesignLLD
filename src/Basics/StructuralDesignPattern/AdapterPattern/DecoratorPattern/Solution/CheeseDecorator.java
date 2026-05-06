package Basics.StructuralDesignPattern.AdapterPattern.DecoratorPattern.Solution;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
