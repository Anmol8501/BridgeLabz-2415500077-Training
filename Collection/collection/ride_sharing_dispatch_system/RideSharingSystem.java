package ride_sharing_dispatch_system;
import java.util.*;

public class RideSharingSystem {
    public static void main(String[] args) {

        // ---------------------------------
        // 1️⃣ DATA STRUCTURES
        // ---------------------------------

        // Queue for normal pending ride requests
        Queue<String> rideQueue = new LinkedList<>();

        // PriorityQueue for urgent/high-priority requests
        PriorityQueue<String> priorityRequests = new PriorityQueue<>();

        // Set of available drivers
        Set<String> drivers = new HashSet<>();

        // List of completed rides
        List<String> rideHistory = new ArrayList<>();


        // ---------------------------------
        // 2️⃣ ADD RIDE REQUESTS
        // ---------------------------------
        System.out.println("\nAdding Ride Requests...");

        rideQueue.add("Ride#101 from UserA");
        rideQueue.add("Ride#102 from UserB");
        rideQueue.add("Ride#103 from UserC");

        System.out.println("Normal Requests: " + rideQueue);

        // High priority: closer pickup / emergency request
        priorityRequests.add("UrgentRide#201 from UserX");
        priorityRequests.add("UrgentRide#202 from UserY");

        System.out.println("High Priority Requests: " + priorityRequests);


        // ---------------------------------
        // 3️⃣ ADD AVAILABLE DRIVERS (Set avoids duplicates)
        // ---------------------------------
        System.out.println("\nAdding Drivers...");

        drivers.add("Driver1");
        drivers.add("Driver2");
        drivers.add("Driver3");
        drivers.add("Driver1");  // duplicate ignored

        System.out.println("Available Drivers: " + drivers);



        // ---------------------------------
        // 4️⃣ ASSIGN DRIVERS TO REQUESTS
        // Priority requests handled first
        // ---------------------------------
        System.out.println("\nAssigning Rides...\n");

        while (!drivers.isEmpty() && (!priorityRequests.isEmpty() || !rideQueue.isEmpty())) {

            String rideToServe;

            // Serve high-priority first
            if (!priorityRequests.isEmpty()) {
                rideToServe = priorityRequests.poll();
            } else {
                rideToServe = rideQueue.poll();
            }

            // Assign driver
            String driver = drivers.iterator().next();  // get any available driver
            drivers.remove(driver);

            String completedRide = driver + " completed: (" + rideToServe + ")";
            System.out.println(completedRide);

            rideHistory.add(completedRide);
        }


        // ------------------------------
        // 5️⃣ SHOW RIDE HISTORY
        // ------------------------------
        System.out.println("\nRide History (Completed Rides):");
        for (String r : rideHistory) {
            System.out.println(r);
        }

        System.out.println("\nRemaining ride requests (if any):");
        System.out.println("Normal Queue: " + rideQueue);
        System.out.println("Priority Queue: " + priorityRequests);

        System.out.println("\nRemaining available drivers:");
        System.out.println(drivers);
    }
}
