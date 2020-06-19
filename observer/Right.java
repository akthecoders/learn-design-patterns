package observer;

interface Observable {
    public void notifyObservers();
    public void add(Observer o);
    public void remove(Observer o);
    public int temperature();
}


class WeatherStationObservable implements Observable {
    Observer[] observers = new Observer[10];
    int index = 0;
    public void add(Observer o) {
        observers[index++] = o;
    }
    public void remove(Observer o) {
        int i = 0;
        for (Observer observer : observers) {
            if(observer == o) {
                this.observers[i] = null;
                break;
            }
            i++;
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int temperature() {
        return 20;
    }
}


interface Observer {
    public void update();
}

class MobileDisplayObserver implements Observer {
    Observable o;
    public MobileDisplayObserver(Observable o) {
        this.o = o;
    }
    public void update() {
        this.getTemperature();
    }

    public void getTemperature() {
        this.display(this.o.temperature());
    }

    public void display(int t) {
        System.out.println(t);
    }
}

public class Right {
    public static void main(String [] args) {
        Observable observable = new WeatherStationObservable();
        MobileDisplayObserver md = new MobileDisplayObserver(observable);
        observable.add(md);
    }
}