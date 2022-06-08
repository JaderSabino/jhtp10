public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "Teste", 5, 2.9);
        displayInvoice(invoice);
        invoice.setNumber("2");
        displayInvoice(invoice);
        invoice.setDescription("Description 2");
        displayInvoice(invoice);
        invoice.setQuantity(-2);
        displayInvoice(invoice);
        invoice.setQuantity(2);
        displayInvoice(invoice);
        invoice.setAmount(-2);
        displayInvoice(invoice);
        invoice.setAmount(2);
        displayInvoice(invoice);
    }

    public static void displayInvoice(Invoice invoice) {
        System.out.println("-----------------------------------------------");
        System.out.printf("Number: %s%n", invoice.getNumber());
        System.out.printf("Description: %s%n", invoice.getDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Amount: $%.2f%n", invoice.getAmount());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}
