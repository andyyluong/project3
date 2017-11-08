/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * A program that tests the invoice classes.
 */
public class InvoiceTester {
    
    final SalesInvoice invoice = new SalesInvoice();
    final InvoiceFormatter formatter = new SimpleFormatter();

    // This text area will contain the formatted invoice
    final JTextArea textArea = new JTextArea(20,40);

    //When the invoice changes, update the text area
    ChangeListener listener = new ChangeListener() {
    @Override
    public void stateChanged(ChangeEvent event) {
        textArea.setText(SalesInvoice.format(formatter));
        }   
    };
    invoice.addChangeListener(listener);

    //Add line items to a combo box
    final JComboBox combo = new JComboBox();
    BikePart bikehandle = new BikePart("bikehandle", 1234567890, 10.00, 8.00, false, 10);
    BikePart wtbsaddle = new BikePart("WTB_Saddle", 1234567891, 12.00, 10.00, true, 5);
    combo.addItem(bikehandle);
    combo.addItem(wtbsaddle);
    Bundle bundle = new Bundle();
    bundle.add(bikehandle);
    bundle.add(wtbsaddle);
    combo.addItem(new DiscountedItem(bundle, 10));

    //Make a button for adding the currently selected
    //item to the invoice
    JButton addButton = new JButton("Add");
    addButton.addActionListener(event -> {
        SalesItem item = (SalesItem) combo.getSelectedItem();
        invoice.addItem(item);
    });

    //Put the combo box and the add button into a panel
    JPanel panel = new JPanel();
    panel.add(combo);
    panel.add(addButton);

    //Add the text area and panel to the fram
    JFrame frame = new JFrame();
    frame.add(new JScrollPane(textArea, BorderLayout.CENTER);
    frame.add(panel, BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}