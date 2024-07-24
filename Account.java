public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments: initial balance
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating Account objects
        Account account1 = new Account();
        Account account2 = new Account(100.0);

        // Testing the methods
        account1.deposit(50.0);
        account1.displayBalance();

        account2.withdraw(30.0);
        account2.displayBalance();

        account2.withdraw(100.0);
        account2.displayBalance();
    }
}
