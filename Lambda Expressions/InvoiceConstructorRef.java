import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;
    Invoice(int id) { this.id = id; }
    public String toString() { return "Invoice ID: " + id; }
}

public class InvoiceConstructorRef {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(501, 502, 503);
        List<Invoice> invoices = ids.stream()
                                    .map(Invoice::new) // Constructor reference
                                    .toList();

        invoices.forEach(System.out::println);
    }
}
