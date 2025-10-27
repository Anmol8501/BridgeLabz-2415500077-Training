package Method_References.Invoice_Object_Creation;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> transactionIDs = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        System.out.println("=== Invoice Generation ===");

        List<Invoice> invoices = transactionIDs.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
