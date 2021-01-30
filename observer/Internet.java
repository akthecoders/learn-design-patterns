package observer;

public class Internet implements Observer{
    Observable observable;
    Internet(Observable o) {
        this.observable = o;
    }
    @Override
    public void update() {
        System.out.println("Internet got update " + observable.getUpdatedData());
    }
}
