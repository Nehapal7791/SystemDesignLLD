package Basics.StructuralDesignPattern.AdapterPattern.DecoratorPattern.Solution;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.90;
    }
}
