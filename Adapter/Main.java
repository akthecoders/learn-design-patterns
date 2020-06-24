package Adapter;

public class Main {
    public static void main(String[] args) {
        Bird duck = new Duck();
        duck.makeSound();

        ToyBird toyDuck = new SpongeDuck();
        toyDuck.squeak();


        Bird adaptedDuck = new ToyAdapter(new SpongeDuck());
        adaptedDuck.makeSound();
    }
}