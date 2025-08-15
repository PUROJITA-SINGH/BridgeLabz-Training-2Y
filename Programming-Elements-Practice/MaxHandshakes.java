import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numberOfStudents: ");
        int numberOfStudents = scanner.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The number of possible handshakes is " + handshakes);
        scanner.close();
    }
}
