import java.util.ArrayList;

public class LibraryBooksAggregation {
    public static void main(String[] args) {
        
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        
        Library library1 = new Library("City Library");
        library1.addBook(book1);
        library1.addBook(book2);
        
        Library library2 = new Library("Town Library");
        library2.addBook(book1);        
 
        library1.displayBooks();
        library2.displayBooks();
    }
}

class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getDetails() {
        return "Title: " + title + ", Author: " + author;
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;
    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void displayBooks() {
        System.out.println("Library: " + name);
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("  - " + book.getDetails());
        }
        System.out.println();
    }
}
