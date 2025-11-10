import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        // 1️⃣ Create nested map: subject → (student → marks)
        Map<String, Map<String, Integer>> results = new HashMap<>();

        // 2️⃣ Add subjects and student marks
        results.put("Math", Map.of("Alice", 85, "Bob", 92, "Carol", 78));
        results.put("Science", Map.of("Alice", 88, "Bob", 90, "Carol", 91));
        results.put("English", Map.of("Alice", 95, "Bob", 89, "Carol", 94));

        System.out.println("Exam Results: " + results);

        // 3️⃣ Find topper per subject
        System.out.println("\nTopper per Subject:");
        for (Map.Entry<String, Map<String, Integer>> subjectEntry : results.entrySet()) {
            String subject = subjectEntry.getKey();
            Map<String, Integer> studentMarks = subjectEntry.getValue();

            String topper = null;
            int maxMarks = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
                if (entry.getValue() > maxMarks) {
                    maxMarks = entry.getValue();
                    topper = entry.getKey();
                }
            }
            System.out.println(subject + " → " + topper + " (" + maxMarks + ")");
        }

        // 4️⃣ Calculate average per subject
        System.out.println("\nAverage Marks per Subject:");
        for (Map.Entry<String, Map<String, Integer>> e : results.entrySet()) {
            int total = 0;
            for (int marks : e.getValue().values()) {
                total += marks;
            }
            double avg = (double) total / e.getValue().size();
            System.out.println(e.getKey() + " → " + avg);
        }

        // 5️⃣ Subjects where any student scored > 90
        System.out.println("\nSubjects with at least one score > 90:");
        for (Map.Entry<String, Map<String, Integer>> e : results.entrySet()) {
            boolean hasTopScore = e.getValue().values().stream().anyMatch(m -> m > 90);
            if (hasTopScore) {
                System.out.println(e.getKey());
            }
        }
    }
}
