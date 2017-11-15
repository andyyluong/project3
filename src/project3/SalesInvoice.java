package project3;

import javax.swing.event.*;
import java.util.*;

/**
 * An invoice for a sale, consisting of a sales items.
 * @author andyluong
 */
public class SalesInvoice {

    
    private final ArrayList<SalesItem> items;
    private final ArrayList<ChangeListener> listeners;
    
    /**
     * Constructs a blank invoice.
     */
    public SalesInvoice() {
        items = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    /**
     * Adds an item to the invoice.
     * @param item the item to add
     */
    public void addItem(SalesItem item){
        items.add(item);
        //Notify all observers of the change to the invoice
        ChangeEvent event = new ChangeEvent(this);
        for (ChangeListener listener : listeners)
            listener.stateChanged(event);
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
    public Iterator<SalesItem> getItems() {
        
        return new Iterator<SalesItem>() {
            
            @Override
            public boolean hasNext(){
                return current < items.size();
            }

            @Override
            public SalesItem next(){
                return items.get(current++);
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }

            private int current = 0;
        };
    }

    /**
     * Format sales item in invoice
     * @param formatter Invoice formatter
     * @return Sales item formatted in an invoice
     */
    public String format(InvoiceFormatter formatter){
        String r = formatter.formatHeader();
        Iterator<SalesItem> iter = getItems();
        while(iter.hasNext())
            r += formatter.formatSalesItem(iter.next());
        return r + formatter.formatFooter();
    }

}
