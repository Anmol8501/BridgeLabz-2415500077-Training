package banking_system__customer_balance_tracker;
import java.util.*;

public class BankSystem {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 3000.0);
        accounts.put("ACC104", 9500.0);
        accounts.put("ACC105", 18000.0);

        deposit(accounts, "ACC101", 2000);
        withdraw(accounts, "ACC103", 500);
        withdraw(accounts, "ACC103", 5000); 

        System.out.println("\nAccounts sorted by balance (high → low):");
        accounts.entrySet().stream()
                .sorted((a,b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        System.out.println("\nTop 3 Customers:");
        accounts.entrySet().stream()
                .sorted((a,b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }

    static void deposit(Map<String, Double> map, String acc, double amount) {
        map.put(acc, map.get(acc) + amount);
    }

    static void withdraw(Map<String, Double> map, String acc, double amount) {
        if (map.get(acc) < amount) {
            System.out.println("Insufficient balance → " + acc);
            return;
        }
        map.put(acc, map.get(acc) - amount);
    }
}
