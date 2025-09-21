import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account holder name, account number, and balance:");
        String accountHolderName = scanner.nextLine();
        String accountNumber = scanner.nextLine();
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(accountHolderName, accountNumber, balance);
        if (account instanceof BankAccount) {
            account.displayDetails();
        }
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        scanner.close();
    }
}

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    
    public static String getBankName() {
        return bankName;
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: $%.2f\n", balance);
    }
}
