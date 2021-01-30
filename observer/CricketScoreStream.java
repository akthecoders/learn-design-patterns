package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CricketScoreStream implements  Observable {
    List<Observer> observers;
    HashMap<Observer, Integer> map;

    private int score = 0;

    CricketScoreStream() {
        observers = new ArrayList<>();
        map = new HashMap<>();
    }

    @Override
    public void register(Observer observer) {
        map.put(observer, observers.size());
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        Integer index = map.get(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.update();
        }
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    public int getUpdatedData() {
        return this.score;
    }


}
