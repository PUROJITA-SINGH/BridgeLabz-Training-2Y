interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*");
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Test1234")); // true
    }
}
