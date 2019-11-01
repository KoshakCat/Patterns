package strategy;

public class Orc extends Hero {
    public Orc() {
        strategy = new WalkingStrategy();
    }
}
