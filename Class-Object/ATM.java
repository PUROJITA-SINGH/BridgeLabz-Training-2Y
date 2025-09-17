import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account holder name, account number, and initial balance:");
        String accountHolder = scanner.nextLine();
        String accountNumber = scanner.nextLine();
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
        
        while (true) {
            System.out.println("\nChoose an option: 1. Deposit 2. Withdraw 3. Display Balance 4. Exit");
            int choice = scanner.nextInt();
            if (choice == 4) break;
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn $%.2f. New balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal!");
        }
    }
    
    public void displayBalance() {
        System.out.printf("Account Holder: %s\nAccount Number: %s\nBalance: $%.2f\n", 
            accountHolder, accountNumber, balance);
    }
}
