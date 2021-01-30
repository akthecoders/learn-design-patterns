package Facade;

public class Facade {
    ShapeSystem rect;
    ShapeSystem circle;
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