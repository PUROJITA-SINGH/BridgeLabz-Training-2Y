import java.util.ArrayList;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("P001", "Alice", 30));
        patients.add(new OutPatient("P002", "Bob", 45));
        
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.printf("Bill: $%.2f\n", patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).addRecord("Routine checkup");
                System.out.println(((MedicalRecord) patient).viewRecords());
            }
            System.out.println();
        }
    }
}

abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;
    
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }
    
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    
    public abstract double calculateBill();
    
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }
    
    @Override
    public String viewRecords() {
        return "Medical History: " + (medicalHistory.isEmpty() ? "None" : medicalHistory);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient {
    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }
    
    @Override
    public double calculateBill() {
        return 500 + getAge() * 10; // Base fee + age-based cost
    }
}

class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }
    
    @Override
    public double calculateBill() {
        return 100 + getAge() * 5; // Consultation fee + age-based cost
    }
}
