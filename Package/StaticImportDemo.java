import static java.lang.Math.*;  // static import

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25, b = 9;

        System.out.println("sqrt(25): " + sqrt(a));
        System.out.println("pow(2,3): " + pow(2, 3));
        System.out.println("max(25,9): " + max(a, b));
        System.out.println("min(25,9): " + min(a, b));
        System.out.println("abs(-10): " + abs(-10));

        System.out.println("\nStatic import lets you call Math methods directly.");
    }
}
