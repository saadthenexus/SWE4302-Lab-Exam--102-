package src;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceGenerator {
    private Order order;
    private double tax;
    private double totalPrice;

    public InvoiceGenerator(Order order){
        this.order = order;
    }

    public void generateInvoice() throws IOException {
        tax = order.getPrice()*0.08;
        

    }
}
