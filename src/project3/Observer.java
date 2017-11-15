package project3;

/**
 * Observer class contains an observer pattern for changed messages
 * @author andyluong
 */
public abstract class Observer {
    
    protected Subject subject;
    
    /**
     * Changed message
     * @param message Text input
     */
    public abstract void messageChanged(String message);
    
}
