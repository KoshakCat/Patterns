package observer;

public class NewsPaperListener implements EventListener {
    String listenerName;

    public NewsPaperListener(String listenerName) {
        this.listenerName = listenerName;
    }

    public void update(String event) {
        System.out.println(listenerName + " please be inform, editor printed out new " + event );
    }
}
