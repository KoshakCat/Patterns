package proxy;

public class App {
    public static void main(String[] args) {
        RealRecipe initialRecipe = new RealRecipe("headache recipe", 100500);
        ProxyRecipe proxyRecipe = new ProxyRecipe(initialRecipe);
        proxyRecipe.setNewPeriodRecipe(10);

        System.out.println("Initial recipe : " + initialRecipe);
        System.out.println("Changed period recipe : " + proxyRecipe);
    }
}
