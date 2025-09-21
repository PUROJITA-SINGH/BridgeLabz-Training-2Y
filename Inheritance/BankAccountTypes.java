public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA001", 1000.0, 2.5);
        BankAccount checking = new CheckingAccount("CA001", 500.0, 1000.0);
        BankAccount fixedDeposit = new FixedDepositAccount("FD001", 2000.0, 5);
        
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}

class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void displayAccountType() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + String.format("%.2f", balance));
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Savings, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Checking, Withdrawal Limit: $" + String.format("%.2f", withdrawalLimit));
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;
    
    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Fixed Deposit, Tenure: " + tenure + " years");
    }
}
