package observer;

public class Television implements Observer {
    Observable observable;
    Television(Observable o) {
        this.observable = o;
    }
    @Override
    public void update() {
        System.out.println("Television got update " + observable.getUpdatedData());
    }
}
