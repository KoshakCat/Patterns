package strategy;

public class Pegasus extends Hero {
    public Pegasus() {
        strategy = new FlyingStrategy();
    }
}
