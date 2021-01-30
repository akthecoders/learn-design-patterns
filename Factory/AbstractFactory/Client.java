package Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Factory carFactory = AbstractFactory.getFactory("car");
        assert carFactory != null;
        Vehicles audi = carFactory.getVehicle("audi");
        audi.getName();

        Factory truckFactory = AbstractFactory.getFactory("truck");
        assert truckFactory != null;
        Vehicles smallTruck = truckFactory.getVehicle("small");
        smallTruck.getName();

    }
}
