import java.util.*;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public abstract double calculateInterest();
}
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
public class d {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA123", "Alice", 8000, 0.04));
        accounts.add(new CurrentAccount("CA456", "Bob", 15000, 0.02));
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(50000);
                System.out.println("Eligible for Loan: " + loanAccount.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}