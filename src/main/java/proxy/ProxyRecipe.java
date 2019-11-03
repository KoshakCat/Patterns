package proxy;

public class ProxyRecipe implements Recipe {
    private Recipe realRecipe;
    private int newPeriodRecipe;

    public ProxyRecipe(Recipe realRecipe) {
        this.realRecipe = realRecipe;
    }

    public String getText() {
        return realRecipe.getText();
    }

    public int getPeriodRecipe() {
        return newPeriodRecipe;
    }

    public void setNewPeriodRecipe(int newPeriodRecipe) {
        this.newPeriodRecipe = newPeriodRecipe;
    }

    @Override
    public String toString() {
        return "ProxyRecipe{" +
                "textRecipe='" + getText() + '\'' +
                ", periodRecipe=" + newPeriodRecipe +
                '}';
    }
}
