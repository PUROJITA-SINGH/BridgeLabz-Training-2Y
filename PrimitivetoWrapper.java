import java.util.Scanner;

public class PrimitivetoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitive = scanner.nextInt();

        // Manual boxing
        Integer wrapper = Integer.valueOf(primitive);

        System.out.println("Primitive value: " + primitive);
        System.out.println("Wrapper object value: " + wrapper);

        scanner.close();
    }
}
