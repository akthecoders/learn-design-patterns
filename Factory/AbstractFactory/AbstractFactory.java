package Factory.AbstractFactory;

public class AbstractFactory {
    static Factory getFactory(String input) {
        if(input.equalsIgnoreCase("car")) return new CarFactory();
        else if(input.equalsIgnoreCase("truck")) return new TruckFactory();

        return null;
    }
}