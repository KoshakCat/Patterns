package strategy;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        new Orc().executeStrategy();
        new Pegasus().executeStrategy();
        new Vampire().executeStrategy();

        System.out.println("\nset new strategy for orc ... ");
        Orc orc = new Orc();
        orc.setStrategy(new FlyingWithMagicStrategy());
        orc.executeStrategy();
    }

}
