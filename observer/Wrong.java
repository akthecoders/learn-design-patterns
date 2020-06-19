package observer;

class WeatherStation {
    public int getTemperature() {
        return 5;
    }
}

class MobileDisplay {
    public void getTemperature() {
        WeatherStation station = new WeatherStation();
        this.displayTemp(station.getTemperature());
    }

    public void displayTemp(int t) {
        System.out.println(t);
    }
}

public class Wrong {
    
}