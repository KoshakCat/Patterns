package observer;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();

        EventListener listenerMagazines1 = new MagazineListener("Vasya");
        EventListener listenerMagazines2 = new MagazineListener("Kolya");
        EventListener listenerMagazines3 = new MagazineListener("Nataha");

        EventListener listenerNewsPaper1 = new NewsPaperListener("incognito");
        EventListener listenerNewsPaper2 = new NewsPaperListener("Vasya");

        editor.eventManager.subscribe("magazine", listenerMagazines1);
        editor.eventManager.subscribe("magazine", listenerMagazines2);
        editor.eventManager.subscribe("magazine", listenerMagazines3);

        editor.eventManager.subscribe("newspaper", listenerNewsPaper1);
        editor.eventManager.subscribe("newspaper", listenerNewsPaper2);

        editor.printNewsPapers();
        editor.printMagazines();
    }
}
