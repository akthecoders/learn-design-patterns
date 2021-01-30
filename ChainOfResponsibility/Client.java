package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Responsiblity nameHandler = new NameHandler();
        Responsiblity placeHandler = new PlaceHandler(nameHandler);

        nameHandler.handle("name");


    }
}
