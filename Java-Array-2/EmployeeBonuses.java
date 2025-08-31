import java.util.Scanner;

public class EmployeeBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] years = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            int year = scanner.nextInt();
            if (salary < 0 || year < 0) {
                System.out.println("Invalid input. Enter again:");
                i--;
                continue;
            }
            salaries[i] = salary;
            years[i] = year;
        }
        
        for (int i = 0; i < 10; i++) {
            double bonusRate = years[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        scanner.close();
    }
}
