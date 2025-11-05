import java.util.*;

abstract class CourseType { String type; CourseType(String t){ type=t; } public String toString(){return type;} }
class ExamCourse extends CourseType { ExamCourse(){ super("Exam-Based"); } }
class AssignmentCourse extends CourseType { AssignmentCourse(){ super("Assignment-Based"); } }

class Course<T extends CourseType> {
    T courseType;
    Course(T type){ this.courseType = type; }
}

public class UniversityCourse {
    public static void printCourses(List<? extends CourseType> courses){
        for(CourseType c : courses) System.out.println(c);
    }

    public static void main(String[] args){
        List<CourseType> courseList = Arrays.asList(new ExamCourse(), new AssignmentCourse());
        printCourses(courseList);
    }
}
