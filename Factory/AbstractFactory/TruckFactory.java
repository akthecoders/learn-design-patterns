package Factory.AbstractFactory;

public class TruckFactory implements Factory {
    @Override
    public Vehicles getVehicle(String input) {
        if(input.equalsIgnoreCase("small")) return new SmallTruck();
        else if(input.equalsIgnoreCase("big")) return new BigTruck();

        return null;
    }
}
