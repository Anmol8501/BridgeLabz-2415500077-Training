package event_ticket_reservation_system;
import java.util.*;

//-------------------------------
//Booking Class
//-------------------------------
class Booking implements Comparable<Booking> {
 String userId;
 String eventName;
 boolean isVIP;

 public Booking(String userId, String eventName, boolean isVIP) {
     this.userId = userId;
     this.eventName = eventName;
     this.isVIP = isVIP;
 }

 @Override
 public int compareTo(Booking other) {
     // VIP gets higher priority (VIP = true should come first)
     return Boolean.compare(other.isVIP, this.isVIP);
 }

 @Override
 public String toString() {
     return userId + " | Event: " + eventName + " | VIP: " + isVIP;
 }
}

//-------------------------------
//Main Class
//-------------------------------
public class EventReservationSystem {
 public static void main(String[] args) {

     // Data Structures
     List<Booking> allConfirmedBookings = new ArrayList<>();
     Set<String> registeredUsers = new HashSet<>();
     Queue<Booking> bookingQueue = new LinkedList<>();
     PriorityQueue<Booking> priorityVIPQueue = new PriorityQueue<>();

     // -------------------------------
     // 1. Register Users (Avoid Duplicates)
     // -------------------------------
     registerUser("user01", registeredUsers);
     registerUser("user02", registeredUsers);
     registerUser("user03", registeredUsers);
     registerUser("user02", registeredUsers); // duplicate

     // -------------------------------
     // 2. Accept Booking Requests
     // -------------------------------
     Booking b1 = new Booking("user01", "Concert A", false);
     Booking b2 = new Booking("user02", "Concert A", true);
     Booking b3 = new Booking("user03", "Concert B", false);
     Booking b4 = new Booking("user01", "Concert C", true);

     addBookingRequest(b1, bookingQueue, priorityVIPQueue);
     addBookingRequest(b2, bookingQueue, priorityVIPQueue);
     addBookingRequest(b3, bookingQueue, priorityVIPQueue);
     addBookingRequest(b4, bookingQueue, priorityVIPQueue);

     // -------------------------------
     // 3. VIP gets priority confirmation
     // -------------------------------
     while (!bookingQueue.isEmpty() || !priorityVIPQueue.isEmpty()) {

         Booking confirmed;

         // VIP bookings confirmed first
         if (!priorityVIPQueue.isEmpty()) {
             confirmed = priorityVIPQueue.poll();
         } else {
             confirmed = bookingQueue.poll();
         }

         allConfirmedBookings.add(confirmed);
         System.out.println("Booking Confirmed → " + confirmed);
     }

     // -------------------------------
     // 4. Display Final Confirmed Bookings
     // -------------------------------
     System.out.println("\n===== FINAL CONFIRMED BOOKINGS =====");
     for (Booking b : allConfirmedBookings) {
         System.out.println(b);
     }
 }

 // -----------------------------------
 // Helper Functions
 // -----------------------------------

 public static void registerUser(String userId, Set<String> users) {
     if (users.contains(userId)) {
         System.out.println("User already registered: " + userId);
     } else {
         users.add(userId);
         System.out.println("Registered successfully: " + userId);
     }
 }

 public static void addBookingRequest(Booking booking, 
                                      Queue<Booking> queue, 
                                      PriorityQueue<Booking> vipQueue) {

     if (booking.isVIP) {
         vipQueue.add(booking);
         System.out.println("VIP Booking Added → " + booking);
     } else {
         queue.add(booking);
         System.out.println("Regular Booking Added → " + booking);
     }
 }
}
