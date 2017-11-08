/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 * This interface describes the tasks that an invoice formatter needs to carry out.
 * @author andyluong
 */
public interface InvoiceFormatter {
    
    /**
     * Formats the header of the invoice.
     * @return the invoice header
     */
    String formatHeader();

    /**
     * Formats a line item of the invoice.
     * @param item
     * @return the formatted line item.
     */
    String formatSalesItem(SalesItem item);

    /**
     * Formats the footer of the invoice.
     * @return the invoice footer
     */
    String formatFooter();

}
    
