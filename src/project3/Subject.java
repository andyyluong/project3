package project3;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject class contains the subject for the observer
 * @author andyluong
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    /**
     * Get message for observer
     * @return Message
     */
    public String getMessage() { 
        return message; 
    }

    /**
     * Set message for observer
     * @param message Message
     */
    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    /**
     * Update message for observer
     * @param message Message
     */
    public void updateMessage(String message) {
        this.message += message;
        notifyAllObservers();
    }

    /**
     * Attach observer
     * @param observer Observer
     */
    public void attach(Observer observer) { 
        observers.add(observer); 
    }

    /**
     * Notify all observers 
     */
    public void notifyAllObservers() {
        for (Observer observer : observers)
            observer.messageChanged(message);
    }    
}
