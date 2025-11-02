import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        Faculty faculty = new Faculty("Dr. Smith", "Java Programming");

        System.out.println("=== Student Details ===");
        student.display();

        System.out.println("\n=== Faculty Details ===");
        faculty.display();
    }
}
