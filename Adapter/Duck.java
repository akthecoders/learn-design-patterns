package Adapter;

public class Duck implements Bird {
    @Override
    public void speak() {
        System.out.println("Duck can speaking");
    }
}
