// Simple simulation of modules in one file

class Student {
    public void show() {
        System.out.println("Student from module 'collegeinfo'");
    }
}

public class ModularProgrammingDemo {
    public static void main(String[] args) {
        new Student().show();

        System.out.println("\n(Conceptually: module 'collegeinfo' exports college.student; "
                + "module 'app' requires collegeinfo)");
    }
}
