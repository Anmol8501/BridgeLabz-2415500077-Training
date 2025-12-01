package banking_transaction_system;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        // ------------------------------------------
        // 1️⃣ DATA STRUCTURES
        // ------------------------------------------

        // List to store ALL executed transactions
        List<String> transactionHistory = new ArrayList<>();

        // Queue for pending transactions
        Queue<String> pendingTransactions = new LinkedList<>();

        // Set for valid/registered account IDs
        Set<String> validAccounts = new HashSet<>();

        // Stack for rollback (undo last transaction)
        Stack<String> rollbackStack = new Stack<>();


        // ------------------------------------------
        // 2️⃣ ADD VALID ACCOUNTS
        // ------------------------------------------
        System.out.println("Adding valid accounts...");
        validAccounts.add("ACC1001");
        validAccounts.add("ACC1002");
        validAccounts.add("ACC1003");

        System.out.println("Valid Accounts: " + validAccounts);


        // ------------------------------------------
        // 3️⃣ ADD TRANSACTIONS TO QUEUE
        // Format: "ACCID: Transaction Details"
        // ------------------------------------------
        System.out.println("\nAdding Transactions...");

        pendingTransactions.add("ACC1001: Deposit ₹2000");
        pendingTransactions.add("ACC1002: Withdraw ₹500");
        pendingTransactions.add("ACC9999: Deposit ₹1000"); // invalid
        pendingTransactions.add("ACC1003: Withdraw ₹300");

        System.out.println("Pending Transactions: " + pendingTransactions);


        // ------------------------------------------
        // 4️⃣ EXECUTE TRANSACTIONS SEQUENTIALLY
        // Validate Account before processing
        // ------------------------------------------
        System.out.println("\nProcessing Transactions...\n");

        while (!pendingTransactions.isEmpty()) {
            String txn = pendingTransactions.poll();

            String accID = txn.split(":")[0];  // extract account

            if (!validAccounts.contains(accID)) {
                System.out.println("❌ Invalid Account! Skipping: " + txn);
                continue;
            }

            System.out.println("✔ Executed: " + txn);

            // Add to history
            transactionHistory.add(txn);

            // Push to rollback stack
            rollbackStack.push(txn);
        }


        // ------------------------------------------
        // 5️⃣ ROLLBACK LAST TRANSACTION
        // ------------------------------------------
        System.out.println("\nAttempting Rollback...");

        if (!rollbackStack.isEmpty()) {
            String lastTxn = rollbackStack.pop();
            System.out.println("⟲ Rolled Back Transaction: " + lastTxn);

            // Remove from transaction history
            transactionHistory.remove(lastTxn);
        } else {
            System.out.println("No transactions to rollback.");
        }


        // ------------------------------------------
        // 6️⃣ DISPLAY FINAL TRANSACTION HISTORY
        // ------------------------------------------
        System.out.println("\nFinal Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}
