package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        Coffee chocolateCoffee = new DecorateChocolate(latte);
        Coffee milkWithChocolate = new DecorateMilk(chocolateCoffee);

        System.out.println("Cost of Latte : " + latte.cost());
        System.out.println("Cost of chocolateCoffee : " + chocolateCoffee.cost());
        System.out.println("Cost of milkWithChocolate : " + milkWithChocolate.cost());
    }
}