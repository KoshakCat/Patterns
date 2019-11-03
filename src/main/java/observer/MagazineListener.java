package observer;

public class MagazineListener implements EventListener {
    String listenerName;

    public MagazineListener(String listenerName) {
        this.listenerName = listenerName;
    }

    public void update(String event) {
        System.out.println(listenerName + " please be inform, editor printed out new " + event );
    }
}
