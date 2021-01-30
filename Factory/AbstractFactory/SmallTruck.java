package Factory.AbstractFactory;

public class SmallTruck implements Vehicles {
    @Override
    public void getName() {
        System.out.println("Truck ");
    }
}
