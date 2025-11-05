// Single-file runnable demo of using user-defined packages conceptually.

class Student {
    public void showDetails() {
        System.out.println("Student Name: Riya");
        System.out.println("Roll No: 101");
    }
}

class Faculty {
    public void showDetails() {
        System.out.println("Faculty Name: Dr. Sharma");
        System.out.println("Subject: Computer Science");
    }
}

public class UserDefinedPackages {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.showDetails();
        f.showDetails();

        System.out.println("\n(Note: In a real project, Student would be in 'college.student' package, and Faculty in 'college.faculty')");
    }
}

