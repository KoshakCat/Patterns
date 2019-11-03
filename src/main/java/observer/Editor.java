package observer;

public class Editor {
    public EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager("magazine", "newspaper");
    }

    public void printMagazines () {
        eventManager.notifySubscribers("magazine");
    }

    public void printNewsPapers () {
        eventManager.notifySubscribers("newspaper");
    }
}
