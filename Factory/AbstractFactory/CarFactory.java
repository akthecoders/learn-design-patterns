package Factory.AbstractFactory;

public class CarFactory implements Factory {

    @Override
    public Vehicles getVehicle(String input) {
        if(input.equalsIgnoreCase("audi")) return new Audi();
        else if(input.equalsIgnoreCase("maruti")) return new Maruti();

        return null;
    }
}
