// Simulated packages: library.books, library.members, library.transactions

class Book {
    String title = "Java Basics";
    public void showBook() { System.out.println("Book: " + title); }
}

class Member {
    String name = "Riya";
    public void showMember() { System.out.println("Member: " + name); }
}

class Transaction {
    public void issue(Book b, Member m) {
        System.out.println("Issuing " + b.title + " to " + m.name);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.showBook();
        m.showMember();
        t.issue(b, m);

        System.out.println("\n(In real project: each class would be in its own package)");
    }
}
