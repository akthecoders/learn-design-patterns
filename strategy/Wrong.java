package strategy;

class Duck {
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println("Flying");
    }
}

class WaterDuck extends Duck{
    public void quack() {
        System.out.println("Quacking");
    }
    public void fly() {
        System.out.println("I Swim");
    }
}

class LandDuck extends Duck {
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println("Cannot fly");
    }
}

class RubberDuck extends Duck {
    public void quack() {
        System.out.println("Cannot Quack");
    }

    public void fly() {
        System.out.println("Cannot fly");
    }
}

public class Wrong {
    public static void main(String args) {
        Duck duck = new RubberDuck();
        duck.quack();
        duck.fly();
    }
}