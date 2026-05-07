package Basics.StructuralDesignPattern.DecoratorPattern.Problem;

public class PizzaApp {
    static void main() {
        Pizza pizza= new OliveCheesePizza();
        System.out.println( pizza.getDescription());
        System.out.println( pizza.getCost());

    }
}
