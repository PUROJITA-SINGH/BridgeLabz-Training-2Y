// Simulated package structure:
// com.university.department.cse.Course

class Course {
    public void showCourse() {
        System.out.println("Course: B.Tech CSE");
        System.out.println("Duration: 4 Years");
    }
}

public class PackageHierarchy {
    public static void main(String[] args) {
        Course c = new Course();
        c.showCourse();

        System.out.println("\n(Note: In a real project, Course would be inside package 'com.university.department.cse')");
    }
}


