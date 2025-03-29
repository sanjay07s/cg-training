class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    public int getMaturityPeriod() {
        return maturityPeriod;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
public class e {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("C456", 2000.0, 1000.0);
        FixedDepositAccount fixed = new FixedDepositAccount("F789", 10000.0, 12);
        savings.displayAccountType();
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println();
        checking.displayAccountType();
        System.out.println("Account Number: " + checking.getAccountNumber());
        System.out.println("Balance: $" + checking.getBalance());
        System.out.println();
        fixed.displayAccountType();
        System.out.println("Account Number: " + fixed.getAccountNumber());
        System.out.println("Balance: $" + fixed.getBalance());
    }
}