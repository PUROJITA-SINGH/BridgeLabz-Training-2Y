public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Mathematics", 12);
        OnlineCourse online = new OnlineCourse("Programming", 8, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Data Science", 10, "Coursera", true, 99.99, 10.0);
        
        course.displayDetails();
        online.displayDetails();
        paid.displayDetails();
    }
}

class Course {
    protected String courseName;
    protected int duration;
    
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;
    
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + String.format("%.2f", fee) + ", Discount: " + discount + "%");
    }
}
