package project3;

import javax.swing.event.*;
import java.util.*;

/**
 * An invoice for a sale, consisting of a sales items.
 * @author andyluong
 */
public class SalesInvoice {
    
    Date saleDate;
    String client;
    String clientReceived;
    double totalInvoicePrice;
    

    /**
     * Sales invoice constructor.
     * @param sd Sale date
     * @param aClient Client
     * @param aClientReceived Client that receives parts
     * @param aTotalInvoicePrice Total invoice cost
     */
    public SalesInvoice(Date sd, String aClient, String aClientReceived, double aTotalInvoicePrice) {
        if(saleDate == null) {
            sd = new Date();
        }
        else {
            sd = saleDate;
        }
        aClient = client;
        aClientReceived = clientReceived;
        aTotalInvoicePrice = totalInvoicePrice;
    }
    
    /**
     * Get sale date
     * @return Sale date
     */
    public Date getSaleDate() {
        return saleDate;
    }
    
    /**
     * Add client that received bike parts
     * @param name Name of client that received bike parts
     */
    public void addClientReceived(String name) {
        clientReceived = name;
    }


}
