package warehouse_delivery_tracking_system;
import java.util.*;

class Package {
    String packageId;
    String description;

    public Package(String packageId, String description) {
        this.packageId = packageId;
        this.description = description;
    }

    @Override
    public String toString() {
        return packageId + " - " + description;
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {

        // 1. Data structures
        Queue<Package> pendingDeliveries = new LinkedList<>();
        Set<String> uniquePackageIDs = new HashSet<>();
        List<Package> deliveredPackages = new ArrayList<>();
        Stack<Package> returnedPackages = new Stack<>();

        // ------------------------------
        // 1. Add and process delivery requests
        // ------------------------------

        Package p1 = new Package("PKG001", "Electronics");
        Package p2 = new Package("PKG002", "Furniture");
        Package p3 = new Package("PKG003", "Clothes");
        Package p4 = new Package("PKG002", "Duplicate ID Test"); // duplicate

        // Add only if unique
        addPackage(p1, pendingDeliveries, uniquePackageIDs);
        addPackage(p2, pendingDeliveries, uniquePackageIDs);
        addPackage(p3, pendingDeliveries, uniquePackageIDs);
        addPackage(p4, pendingDeliveries, uniquePackageIDs); // rejected

        // ------------------------------
        // 2. Process Deliveries
        // ------------------------------

        while (!pendingDeliveries.isEmpty()) {
            Package pkg = pendingDeliveries.poll();

            // Simulating: based on condition → deliver or return
            if (pkg.packageId.equals("PKG003")) {
                System.out.println("Package Returned: " + pkg);
                returnedPackages.push(pkg);
            } else {
                System.out.println("Delivered: " + pkg);
                deliveredPackages.add(pkg);
            }
        }

        // ------------------------------
        // 3. Summary Output
        // ------------------------------

        System.out.println("\n===== DELIVERY SUMMARY =====");

        System.out.println("\nUnique Package IDs:");
        for (String id : uniquePackageIDs) {
            System.out.println(id);
        }

        System.out.println("\nDelivered Packages:");
        for (Package pkg : deliveredPackages) {
            System.out.println(pkg);
        }

        System.out.println("\nReturned/Cancelled Packages:");
        for (Package pkg : returnedPackages) {
            System.out.println(pkg);
        }
    }

    // Helper function inside same file
    public static void addPackage(Package pkg, Queue<Package> queue, Set<String> idSet) {
        if (idSet.contains(pkg.packageId)) {
            System.out.println("Duplicate ID detected → Cannot add: " + pkg.packageId);
        } else {
            idSet.add(pkg.packageId);
            queue.add(pkg);
            System.out.println("Package Added: " + pkg);
        }
    }
}
