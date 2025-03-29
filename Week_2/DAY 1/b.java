import java.util.Scanner
class b {
    String accountHolder
    String accountNumber
    double balance
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder
        this.accountNumber = accountNumber
        this.balance = balance
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount
            System.out.println("Amount deposited: " + amount)
        } else {
            System.out.println("Invalid deposit amount")
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            System.out.println("Amount withdrawn: " + amount)
        } else {
            System.out.println("Insufficient balance or invalid amount")
        }
    }
    void displayBalance() {
        System.out.println("Current balance: " + balance)
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Enter account holder name: ")
        String holder = scanner.nextLine()
        System.out.print("Enter account number: ")
        String number = scanner.nextLine()
        System.out.print("Enter initial balance: ")
        double initialBalance = scanner.nextDouble()
        BankAccount account = new BankAccount(holder, number, initialBalance)
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Exit")
            System.out.print("Choose an option: ")
            int choice = scanner.nextInt()
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ")
                double amount = scanner.nextDouble()
                account.deposit(amount)
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ")
                double amount = scanner.nextDouble()
                account.withdraw(amount)
            } else if (choice == 3) {
                account.displayBalance()
            } else if (choice == 4) {
                System.out.println("Exiting...")
                break
            } else {
                System.out.println("Invalid choice")
            }
        }
    }
}