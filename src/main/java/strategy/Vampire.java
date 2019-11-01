package strategy;

public class Vampire extends Hero {
    public Vampire() {
        strategy = new FlyingWithMagicStrategy();
    }
}
