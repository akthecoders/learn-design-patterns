package Adapter;

public class PlasticToyAdapter implements  Bird {
    PlasticBird plasticBird;

    PlasticToyAdapter(PlasticBird bird) {
        this.plasticBird = bird;
    }
    @Override
    public void speak() {
        this.plasticBird.cannotSpeak();
    }
}
