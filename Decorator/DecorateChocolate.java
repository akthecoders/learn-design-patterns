package Decorator;

public class DecorateChocolate extends CoffeeDecorator {
    
    public DecorateChocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return this.decoratedCoffee.cost() + 5;
    }
}