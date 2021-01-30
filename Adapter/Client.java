package Adapter;

public class Client {
    public static void main(String[] args) {
        Bird duck = new Duck();
        duck.speak();

        Bird plasticDuck = new PlasticToyAdapter(new ToyDuck());
        plasticDuck.speak();
    }
}
