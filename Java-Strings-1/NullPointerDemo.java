public class NullPointerDemo {
    public static void main(String[] args) {
        // Demonstrating NullPointerException (unhandled)
        System.out.println("Demonstrating NullPointerException (unhandled):");
        try {
            String str = null;
            int length = str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Demonstrating NullPointerException (handled)
        System.out.println("\nDemonstrating NullPointerException (handled):");
        try {
            String str = null;
            if (str != null) {
                int length = str.length();
            } else {
                throw new NullPointerException("Cannot invoke \"String.length()\" because \"<local0>\" is null");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
