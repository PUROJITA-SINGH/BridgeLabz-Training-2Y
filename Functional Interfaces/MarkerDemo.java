interface SensitiveData { }

class UserCredentials implements SensitiveData {
    String password = "secret123";
}

public class MarkerDemo {
    public static void main(String[] args) {
        UserCredentials uc = new UserCredentials();
        if (uc instanceof SensitiveData)
            System.out.println("Encrypting sensitive data...");
    }
}
