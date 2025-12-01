package website_visit_tracker;
import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        visit(visits, "home");
        visit(visits, "about");
        visit(visits, "products");
        visit(visits, "home");
        visit(visits, "products");
        visit(visits, "contact");
        visit(visits, "home");

        System.out.println("Visits (high → low):");

        visits.entrySet().stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        String mostVisited = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost Visited Page: " + mostVisited);
    }

    static void visit(Map<String, Integer> map, String page) {
        map.put(page, map.getOrDefault(page, 0) + 1);
    }
}
