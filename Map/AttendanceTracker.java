import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Aman", "Riya", "Karan", "Sita", "John");

        // Initialize
        for (String s : students) attendance.put(s, 0);

        // Simulate 15 days
        Random rand = new Random();
        for (int day = 1; day <= 15; day++) {
            for (String s : students) {
                if (rand.nextBoolean()) attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Attendance counts: " + attendance);

        System.out.println("Under 10 days:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " (" + e.getValue() + " days)");
        }
    }
}
