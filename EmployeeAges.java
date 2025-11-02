import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 35};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(age); // Auto-boxing
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest employee: " + youngest + " years");
        System.out.println("Oldest employee: " + oldest + " years");
    }
}
