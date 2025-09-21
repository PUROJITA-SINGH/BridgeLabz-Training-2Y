import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name, age, ailment, and patient ID:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        String ailment = scanner.nextLine();
        String patientID = scanner.nextLine();
        
        Patient patient = new Patient(name, age, ailment, patientID);
        if (patient instanceof Patient) {
            patient.displayDetails();
        }
        Patient.getTotalPatients();
        scanner.close();
    }
}

class Patient {
    private static String hospitalName = "Care Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    
    public static void getTotalPatients() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Total Patients: " + totalPatients);
    }
    
    public void displayDetails() {
        System.out.println("Patient Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }
}
