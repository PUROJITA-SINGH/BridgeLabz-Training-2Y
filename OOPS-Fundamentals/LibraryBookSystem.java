import java.util.Scanner;

public class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title, author, price, and availability (true/false):");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        double price = scanner.nextDouble();
        boolean availability = scanner.nextBoolean();
        
        Book book = new Book(title, author, price, availability);
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
        
        scanner.close();
    }
}

class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;
    
    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }
    
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println();
    }
}
