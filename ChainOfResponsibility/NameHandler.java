package ChainOfResponsibility;

public class NameHandler implements Responsiblity {
    Responsiblity handler;

    NameHandler() {
        this.handler = null;
    }

    NameHandler(Responsiblity handler) {
        this.handler = handler;
    }

    @Override
    public void handle(String input) {
        if(input.equalsIgnoreCase("name")) {
            System.out.println("Name handler is now working");
            return;
        }
        if(handler != null) this.handler.handle(input);
    }
}
