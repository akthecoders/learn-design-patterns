package ChainOfResponsibility;

public class PlaceHandler implements Responsiblity {
    Responsiblity handler;

    PlaceHandler() {
        this.handler = null;
    }

    PlaceHandler(Responsiblity handler) {
        this.handler = handler;
    }

    @Override
    public void handle(String input) {
        if(input.equalsIgnoreCase("place")) {
            System.out.println("Place handler is now working");
            return;
        }
        if(handler != null) this.handler.handle(input);
    }
}
