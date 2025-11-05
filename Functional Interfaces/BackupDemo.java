import java.io.Serializable;

class BackupData implements Serializable {
    String name = "User Data";
}

public class BackupDemo {
    public static void main(String[] args) {
        BackupData data = new BackupData();
        System.out.println("Serializable object created: " + data.name);
    }
}
