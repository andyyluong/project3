/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

 /**
  * A simple invoice formatter.
  * @andyluong
  */
 public class SimpleFormatter implements InvoiceFormatter {
     
    private double total;
     
    /**
     * Format header
     * @return Invoice header
     */
    @Override
    public String formatHeader() {
        total = 0;
        return " I N V O I C E\n\n\n";
    }

    /**
     * Format sales item
     * @param item Sales item
     * @return Sales item and price
     */
    @Override
    public String formatSalesItem(SalesItem item) {
        total += item.getPrice();
        return (String.format("%s: $%.2f\n", item.toString(), item.getPrice()));
    }

    /**
     * Format footer
     * @return Invoice footer
     */
    @Override
    public String formatFooter() {
        return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
    }

 }
