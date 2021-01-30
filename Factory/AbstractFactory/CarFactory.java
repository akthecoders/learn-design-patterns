package Factory.AbstractFactory;

public interface CarFactory {
    Engine assembleEngine();
    Tyres assembleTyres();
}
