public class LibraryManagementBooksAuthors {
    public static void main(String[] args) {
        Author author = new Author("1984", 1949, "George Orwell", "British novelist");
        author.displayInfo();
    }
}

class Book {
    protected String title;
    protected int publicationYear;
    
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    public void displayInfo() {
        System.out.println("Book: " + title + ", Published: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;
    
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}
