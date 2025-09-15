public class BankAccount {
    // Private attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Successfully deposited $%.2f.\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            this.balance -= amount;
            System.out.printf("Successfully withdrew $%.2f.\n", amount);
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.printf("Account Holder: %s | Account: %s | Current Balance: $%.2f\n",
                this.accountHolder, this.accountNumber, this.balance);
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        // Create an account with a $500 initial balance
        BankAccount myAccount = new BankAccount("John Smith", "123456789", 500.00);

        // Perform transactions
        myAccount.displayBalance(); // Initial balance
        myAccount.deposit(150.50);  // Good deposit
        myAccount.displayBalance(); 
        myAccount.withdraw(200.00); // Good withdrawal
        myAccount.displayBalance();
        myAccount.withdraw(500.00); // Failed withdrawal (insufficient funds)
        myAccount.displayBalance(); // Balance should be unchanged
    }
}