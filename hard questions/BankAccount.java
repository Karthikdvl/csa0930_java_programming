import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String depositorName;
    private String accountType;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String depositorName, String accountType) {
        this.accountNumber = accountNumber;
        this.depositorName = depositorName;
        this.accountType = accountType;
        this.balance = 10000.0; // Initial balance (assumed)
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: Rs. " + balance);
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (balance - amount >= 500.0) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient balance. Minimum balance must be Rs. 500.00");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("Enter Depositor Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Type (Savings/Current): ");
        String type = sc.nextLine();

        BankAccount account = new BankAccount(accNumber, name, type);

        System.out.println("\nBank Account Details:");
        account.displayAccountDetails();

        System.out.print("\nEnter the amount to deposit: Rs. ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nEnter the amount to withdraw: Rs. ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        sc.close();
    }
}
