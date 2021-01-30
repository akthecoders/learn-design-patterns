package observer;

public interface Observable {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    int getUpdatedData();
    void setScore(int score);
}
