package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<String, List<EventListener>>();

    public EventManager(String ... events) {
        for(String event : events) {
            this.listeners.put(event, new ArrayList<EventListener>());
        }
    }

    public void subscribe (String event, EventListener newListener) {
        List<EventListener> subscribers = listeners.get(event);
        subscribers.add(newListener);
    }

    public void unsubscribe (String event, EventListener removedListener) {
        List<EventListener> subscribers = listeners.get(event);
        subscribers.remove(removedListener);
    }

    public void notifySubscribers (String event) {
        List<EventListener> subscribers = listeners.get(event);
        for (EventListener listener : subscribers) {
            listener.update(event);
        }
    }

}
