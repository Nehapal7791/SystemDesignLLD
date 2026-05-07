package Basics.StructuralDesignPattern.DecoratorPattern.Solution;

public class PizzaApp {
    static void main() {
        Pizza pizza=new BasicPizza();
        pizza= new OliveDecorator(pizza);
        pizza=new CheeseDecorator(pizza);
        System.out.println( pizza.getDescription());
        System.out.println( pizza.getCost());

    }
}

