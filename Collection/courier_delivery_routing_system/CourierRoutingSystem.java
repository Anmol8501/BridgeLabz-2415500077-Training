package courier_delivery_routing_system;
import java.util.*;

//-------------------------------
//Parcel Class
//-------------------------------
class Parcel implements Comparable<Parcel> {
 String parcelId;
 String description;
 int priority; // Higher number = higher priority

 public Parcel(String parcelId, String description, int priority) {
     this.parcelId = parcelId;
     this.description = description;
     this.priority = priority;
 }

 @Override
 public int compareTo(Parcel other) {
     // Higher priority first
     return Integer.compare(other.priority, this.priority);
 }

 @Override
 public String toString() {
     return parcelId + " - " + description + " | Priority: " + priority;
 }
}

//-------------------------------
//Main Class
//-------------------------------
public class CourierRoutingSystem {
 public static void main(String[] args) {

     // -------------------------------
     // Data Structures
     // -------------------------------
     PriorityQueue<Parcel> highPriorityQueue = new PriorityQueue<>();
     Queue<Parcel> normalQueue = new LinkedList<>();
     Set<String> assignedParcelIDs = new HashSet<>();
     List<Parcel> completedDeliveries = new ArrayList<>();

     // -------------------------------
     // 1. Add Parcels and Assign Priority
     // -------------------------------
     addParcel(new Parcel("PR001", "Electronics", 5), highPriorityQueue, normalQueue, assignedParcelIDs);
     addParcel(new Parcel("PR002", "Furniture", 2), highPriorityQueue, normalQueue, assignedParcelIDs);
     addParcel(new Parcel("PR003", "Documents", 8), highPriorityQueue, normalQueue, assignedParcelIDs);
     addParcel(new Parcel("PR002", "Duplicate Furniture", 4), highPriorityQueue, normalQueue, assignedParcelIDs); // duplicate

     // -------------------------------
     // 2. Assign and Process Deliveries
     // -------------------------------
     System.out.println("\nProcessing Deliveries:");
     while (!highPriorityQueue.isEmpty() || !normalQueue.isEmpty()) {
         Parcel delivery;
         if (!highPriorityQueue.isEmpty()) {
             delivery = highPriorityQueue.poll();
         } else {
             delivery = normalQueue.poll();
         }

         // Simulate delivery
         System.out.println("Delivering: " + delivery);
         completedDeliveries.add(delivery);
     }

     // -------------------------------
     // 3. Final Summary
     // -------------------------------
     System.out.println("\n=== Completed Deliveries ===");
     for (Parcel p : completedDeliveries) {
         System.out.println(p);
     }

     System.out.println("\n=== Assigned Parcel IDs ===");
     for (String id : assignedParcelIDs) {
         System.out.println(id);
     }

     System.out.println("\nHigh Priority Queue Remaining: " + highPriorityQueue.size());
     System.out.println("Normal Queue Remaining: " + normalQueue.size());
 }

 // -------------------------------
 // Helper Method
 // -------------------------------
 public static void addParcel(Parcel p,
                              PriorityQueue<Parcel> highPriorityQueue,
                              Queue<Parcel> normalQueue,
                              Set<String> assignedIDs) {
     if (assignedIDs.contains(p.parcelId)) {
         System.out.println("Duplicate Parcel ID detected → Cannot add: " + p.parcelId);
     } else {
         assignedIDs.add(p.parcelId);
         if (p.priority >= 5) { // threshold for high priority
             highPriorityQueue.add(p);
             System.out.println("High-Priority Parcel Added → " + p);
         } else {
             normalQueue.add(p);
             System.out.println("Normal Parcel Added → " + p);
         }
     }
 }
}
