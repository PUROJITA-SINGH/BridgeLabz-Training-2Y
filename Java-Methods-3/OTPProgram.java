import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OTPProgram {
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All unique: " + areUnique(otps));
    }
    
    public static String generateOTP() {
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000; // 100000 to 999999
        return String.valueOf(otp);
    }
    
    public static boolean areUnique(String[] otps) {
        Set<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}
