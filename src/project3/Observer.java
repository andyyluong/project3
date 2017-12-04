package project3;

/**
 * Observer class contains an observer pattern for changed messages
 * @author andyLuong
 * @author anthonyPhimmasone
 */
public abstract class Observer {
    
    /**
     * Data member
     */
    protected Subject subject;
    
    /**
     * Changed message
     * @param message Text input
     */
    public abstract void messageChanged(String message);
    
}
