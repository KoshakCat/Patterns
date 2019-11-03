package proxy;

public class RealRecipe implements Recipe{

    private final String textRecipe;
    private final int periodRecipe;

    public RealRecipe(String textRecipe, int periodRecipe) {
        this.textRecipe = textRecipe;
        this.periodRecipe = periodRecipe;
    }

    public String getText() {
        return textRecipe;
    }

    public int getPeriodRecipe() {
        return periodRecipe;
    }

    @Override
    public String toString() {
        return "RealRecipe{" +
                "textRecipe='" + textRecipe + '\'' +
                ", periodRecipe=" + periodRecipe +
                '}';
    }
}
