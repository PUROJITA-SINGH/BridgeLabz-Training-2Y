import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 55);
        courses.put("CS102", 3);
        courses.put("CS103", 47);
        courses.put("CS104", 60);
        courses.put("CS105", 2);

        // Add a student
        courses.put("CS103", courses.get("CS103") + 1);

        // Drop a student
        courses.put("CS102", Math.max(0, courses.get("CS102") - 1));

        System.out.println("Near full courses (>=50):");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() >= 50)
                System.out.println(e.getKey() + " → " + e.getValue());

        System.out.println("\nUnder-subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() < 5)
                System.out.println(e.getKey() + " → " + e.getValue());
    }
}
