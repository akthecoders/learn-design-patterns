package Adapter;

public class ToyDuck implements PlasticBird {
    @Override
    public void cannotSpeak() {
        System.out.println(" Plastic Duck cannot speak");
    }
}
