import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title, author, and ISBN:");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        String isbn = scanner.nextLine();
        
        Book book = new Book(title, author, isbn);
        if (book instanceof Book) {
            book.displayDetails();
        }
        Book.displayLibraryName();
        scanner.close();
    }
}

class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
