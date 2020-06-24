package Facade;

public class Facade {
    Rectangle rect;
    Circle circle;
    public Facade() {
        this.rect = new Rectangle();
        this.circle = new Circle();
    }

    public void drawRectangle() {
        this.rect.draw();
    }

    public void drawCircle() {
        this.circle.draw();
    }
}