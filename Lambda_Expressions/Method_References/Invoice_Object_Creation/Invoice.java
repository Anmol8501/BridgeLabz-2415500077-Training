package Method_References.Invoice_Object_Creation;

public class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice created for Transaction: " + transactionId;
    }
}
