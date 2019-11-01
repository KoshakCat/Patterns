package strategy;

public abstract class Hero {
    public Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy () {
        strategy.move();
    }
}
