abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
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
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Applying loan for Savings Account: " + amount);
    }

    public boolean calculateLoanEligibility(double amount) {
        return getBalance() > amount / 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    double calculateInterest() {
        return 0;
    }

    public void applyForLoan(double amount) {
        System.out.println("Applying loan for Current Account: " + amount);
    }

    public boolean calculateLoanEligibility(double amount) {
        return getBalance() > amount / 3;
    }
}
