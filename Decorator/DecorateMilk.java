package Decorator;

public class DecorateMilk extends CoffeeDecorator {
    
    public DecorateMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return this.decoratedCoffee.cost() + 20;
    }
}