import javax.swing.event.*;
import java.util.*;

/**
 * An invoice for a sale, consisting of a line items.
 */
public class Invoice {
    /**
     * Constructs a blank invoice.
     */
    public Invoice(){
        items = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    /**
     * Adds an item to the invoice.
     * @param item the item to add
     */
    public void addItem(LineItem item){
        items.add(item);
        //Notify all observers of the change to the invoice
        ChangeEvent event = new ChangeEvent(this);
        for {ChangeListener listener : listeners)
            listener.stateChanged(even);
    }

        /**
         * Adds a change listener to the invoice.
         * @param listener the change listener to add
         */
        public void addChangeListener(ChangeListener listener){
            listeners.add(listener);
    }

    /**
     * Gets an iterator that iterates through the items.
     * @return an iterator for the items
     */
    public Iterator<LineItem> getItems(){
        return new Iterator<LineItem>(){
            public boolean hasNext(){
                return current < items.size();
            }

            public LineItem next(){
                return items.get(current++);
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }

            private int current = 0;
        };
    }

    public String format(InvoiceFormatter formatter){
        String r = formatter.formatHeader();
        Iterator<LineItem> iter = getItems();
        while(iter.hasNext())
            r += formatter.formatLineItem(iter.next());
        return r + formatter.formatFooter();
    }

    private ArrayList<LineItem> items;
    private ArrayList<changeListener> listeners;
}
