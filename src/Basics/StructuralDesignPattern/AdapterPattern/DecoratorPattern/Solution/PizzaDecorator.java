package Basics.StructuralDesignPattern.AdapterPattern.DecoratorPattern.Solution;

public class PizzaDecorator implements Pizza{
    protected Pizza pizzaDecorator;
    public PizzaDecorator(Pizza pizza){
        this.pizzaDecorator=pizza;
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription();
    }

    @Override
    public double getCost() {
        return pizzaDecorator.getCost();
    }
}
