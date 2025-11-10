import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("978-1234567890", "Java Basics");
        books.put("978-9876543210", "Data Structures");
        books.put("978-1111111111", "Algorithms");

        // Search by ISBN
        String isbn = "978-9876543210";
        System.out.println(books.getOrDefault(isbn, "Book not found"));

        // Remove a book
        books.remove("978-1111111111");

        // Print all books sorted by ISBN
        System.out.println("\nAll Books:");
        for (Map.Entry<String, String> e : books.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        // Search by title
        String searchTitle = "Java Basics";
        boolean found = false;
        for (Map.Entry<String, String> e : books.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nFound title at ISBN: " + e.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("Book not found by title.");
    }
}
