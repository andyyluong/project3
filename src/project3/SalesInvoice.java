package project3;

import java.util.*;

/**
 * Sales invoice for sales associate to generate when selling bike parts to clients.
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
     */
    public SalesInvoice(Date sd, String aClient) {
        if(saleDate == null) {
            sd = new Date();
        }
        else {
            sd = saleDate;
        }
        aClient = client;
        this.totalInvoicePrice = 0;
    }
    
    /**
     * Get sale date
     * @return Sale date
     */
    public Date getSaleDate() {
        return saleDate;
    }
    
    /**
     * Get client
     * @return Client
     */
    public String getClient() {
        return client;
    }
    
    /**
     * Get client that received sold bike part
     * @return 
     */
    public String getClientReceived() {
        return clientReceived;
    }
 
    /**
     * Add client that received sold bike parts
     * @param name Name of client that received sold bike parts
     */
    public void addClientReceived(String name) {
        clientReceived = name;
    }
    
    /**
     * Get total sales invoice price
     * @return Total sales invoice price
     */
    public double getTotalInvoicePrice() {
        return totalInvoicePrice;
    }


}
