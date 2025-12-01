package country_capital_lookup;
import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Australia", "Canberra");
        capitals.put("Canada", "Ottawa");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a country: ");
        String country = sc.nextLine();

        if (capitals.containsKey(country)) {
            System.out.println("Capital: " + capitals.get(country));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("\nAll Countries (A–Z):");
        TreeMap<String, String> sorted = new TreeMap<>(capitals);

        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
        sc.close();
    }
}
