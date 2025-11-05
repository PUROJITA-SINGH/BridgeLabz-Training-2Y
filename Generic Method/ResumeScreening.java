import java.util.*;

abstract class JobRole { String role; JobRole(String r){ role=r; } public String toString(){return role;} }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){ super("Software Engineer"); } }
class DataScientist extends JobRole { DataScientist(){ super("Data Scientist"); } }

class Resume<T extends JobRole> {
    T role;
    Resume(T role){ this.role = role; }
    public String toString(){ return "Resume for " + role; }
}

public class ResumeScreening {
    public static void processResumes(List<? extends JobRole> list){
        for(JobRole j : list) System.out.println("Processing: " + j);
    }

    public static void main(String[] args){
        List<JobRole> jobs = Arrays.asList(new SoftwareEngineer(), new DataScientist());
        processResumes(jobs);
    }
}
