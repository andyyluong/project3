/**
 * This interface describes the tasks that an invoice formatter needs to carry out.
 */
public class InvoiceFormatter {
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
    String formatLineItem(LineItem item);

    /**
     * Formats the footer of the invoice.
     * @return the invoice footer
     */
    String formatFooter();

   /** public String format(InvoiceFormatter formatter){
        String r = formatter.formatHeader();
        Iterator<LineItem> iter = getItems();
        while(iter.hasNext())
        {
            LineItem item = iter.next();
            r += formatter.formatLineItem(item);
        }
        return r + formatter.formatFooter();
    }
    */
}
