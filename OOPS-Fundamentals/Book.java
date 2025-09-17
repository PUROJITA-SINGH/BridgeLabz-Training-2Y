import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title, author, and price:");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        double price = scanner.nextDouble();
        
        // Using parameterized constructor
        Book book1 = new Book(title, author, price);
        book1.displayDetails();
        
        // Using default constructor
        Book book2 = new Book();
        book2.displayDetails();
        
        scanner.close();
    }
    
    private String title;
    private String author;
    private double price;
    
    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println();
    }
}
