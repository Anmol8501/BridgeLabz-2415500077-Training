package library_book_catalog;
import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1111111111", "Java Programming");
        catalog.put("978-2222222222", "Data Structures");
        catalog.put("978-3333333333", "Operating Systems");
        catalog.put("978-4444444444", "Database Management");
        catalog.put("978-5555555555", "Computer Networks");

        System.out.println("Initial Catalog: " + catalog);

        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-0000000000"); 

        catalog.remove("978-4444444444");
        System.out.println("\nAfter Removing ISBN 978-4444444444:");
        System.out.println(catalog);

        System.out.println("\nCatalog Sorted by ISBN:");
        catalog.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        System.out.println("\nSearching book by title: \"Operating Systems\"");
        searchByTitle(catalog, "Operating Systems");

        System.out.println("\nSearching book by title: \"Machine Learning\"");
        searchByTitle(catalog, "Machine Learning");
    }

    public static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("Book found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    public static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;
        for (var entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found! ISBN: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No book found with title: " + title);
    }
}
