package Adapter;

public class ToyAdapter implements Bird{
    ToyBird bird;
    public ToyAdapter(ToyBird bird) {
        this.bird = bird;
    }

    public void makeSound() {
        this.bird.squeak();
    }
}