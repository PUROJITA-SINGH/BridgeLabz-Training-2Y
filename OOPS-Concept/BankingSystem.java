import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("A001", "Alice", 1000));
        accounts.add(new CurrentAccount("A002", "Bob", 5000));
        
        for (BankAccount account : accounts) {
            account.deposit(500);
            account.withdraw(200);
            System.out.println("Interest: $" + String.format("%.2f", account.calculateInterest()));
            if (account instanceof Loanable) {
                ((Loanable) account).applyForLoan();
            }
            System.out.println();
        }
    }
}

abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;
    
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f\n", amount, balance);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn $%.2f. New balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid or insufficient funds!");
        }
    }
    
    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% annual interest
    }
    
    @Override
    public void applyForLoan() {
        System.out.println("Loan eligibility for " + getHolderName() + ": $" + 
            String.format("%.2f", calculateLoanEligibility()));
    }
    
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Up to 2x balance
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * 0.01; // 1% interest
    }
    
    @Override
    public void applyForLoan() {
        System.out.println("Loan eligibility for " + getHolderName() + ": $" + 
            String.format("%.2f", calculateLoanEligibility()));
    }
    
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Up to 5x balance
    }
}
