import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // sorted by name

        // 1. Add students
        grades.put("Alice", 85.0);
        grades.put("Bob", 92.5);
        grades.put("Charlie", 78.0);

        // 2. Update a grade
        grades.put("Alice", 88.0); // Alice re-took test

        // 3. Remove a student
        grades.remove("Charlie");

        // 4. Print all students alphabetically
        for (Map.Entry<String, Double> e : grades.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
