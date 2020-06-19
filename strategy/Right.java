package strategy;

interface QuackStrategy{
    public void quack();
}

class Quack implements QuackStrategy {
    public void quack() {
        System.out.println("Quack");
    }
}

class NoQuack implements QuackStrategy {
    public void quack() {
        System.out.println("Cannot Quack");
    }
}

interface FlyStrategy {
    public void fly();
}

class Fly implements FlyStrategy {
    public void fly() {
        System.out.println("Flying");
    }
}

class NoFly implements FlyStrategy {
    public void fly() {
        System.out.println("Cannot Fly");
    }
}


class DuckCorrect {
    private QuackStrategy q;
    private FlyStrategy f;

    public DuckCorrect(QuackStrategy q, FlyStrategy f) {
        this.q = q;
        this.f = f;
    }

    public void fly() {
        this.f.fly();
    }
    public void quack() {
        this.q.quack();
    }
}

public class Right {
    public static void main(String args[]) {
        DuckCorrect rubberDuck = new DuckCorrect(new NoQuack(), new NoFly());
        rubberDuck.quack();
        rubberDuck.fly();
    }
}