package banking_transaction_system;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        List<String> transactionHistory = new ArrayList<>();
        Queue<String> pendingTransactions = new LinkedList<>();

        Set<String> validAccounts = new HashSet<>();
        Stack<String> rollbackStack = new Stack<>();

        System.out.println("Adding valid accounts...");
        validAccounts.add("ACC1001");
        validAccounts.add("ACC1002");
        validAccounts.add("ACC1003");

        System.out.println("Valid Accounts: " + validAccounts);

        System.out.println("\nAdding Transactions...");

        pendingTransactions.add("ACC1001: Deposit ₹2000");
        pendingTransactions.add("ACC1002: Withdraw ₹500");
        pendingTransactions.add("ACC9999: Deposit ₹1000"); // invalid
        pendingTransactions.add("ACC1003: Withdraw ₹300");

        System.out.println("Pending Transactions: " + pendingTransactions);

        System.out.println("\nProcessing Transactions...\n");

        while (!pendingTransactions.isEmpty()) {
            String txn = pendingTransactions.poll();

            String accID = txn.split(":")[0];  // extract account

            if (!validAccounts.contains(accID)) {
                System.out.println("❌ Invalid Account! Skipping: " + txn);
                continue;
            }

            System.out.println("✔ Executed: " + txn);
            transactionHistory.add(txn);

            rollbackStack.push(txn);
        }

        System.out.println("\nAttempting Rollback...");

        if (!rollbackStack.isEmpty()) {
            String lastTxn = rollbackStack.pop();
            System.out.println("⟲ Rolled Back Transaction: " + lastTxn);

            transactionHistory.remove(lastTxn);
        } else {
            System.out.println("No transactions to rollback.");
        }

        System.out.println("\nFinal Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}
