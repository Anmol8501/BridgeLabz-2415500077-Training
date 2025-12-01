package library_management_system;
import java.util.*;

//-------------------------------
//Book Class
//-------------------------------
class Book {
 String bookId;
 String title;

 public Book(String bookId, String title) {
     this.bookId = bookId;
     this.title = title;
 }

 @Override
 public String toString() {
     return bookId + " - " + title;
 }
}

//-------------------------------
//Main Class
//-------------------------------
public class LibraryManagementSystem {
 public static void main(String[] args) {

     // -------------------------------
     // Data Structures
     // -------------------------------
     List<Book> allBooks = new ArrayList<>();
     Set<String> members = new HashSet<>();
     Queue<Book> issueQueue = new LinkedList<>();
     Stack<Book> recentlyReturned = new Stack<>();

     // -------------------------------
     // 1. Add Books to the System
     // -------------------------------
     Book b1 = new Book("B101", "Java Programming");
     Book b2 = new Book("B102", "Data Structures");
     Book b3 = new Book("B103", "Algorithms");

     allBooks.add(b1);
     allBooks.add(b2);
     allBooks.add(b3);

     System.out.println("Books Added to Library:");
     for (Book b : allBooks) System.out.println(b);

     // -------------------------------
     // 2. Register Members (Avoid Duplicates)
     // -------------------------------
     registerMember("M001", members);
     registerMember("M002", members);
     registerMember("M003", members);
     registerMember("M002", members); // duplicate

     // -------------------------------
     // 3. Queue Books for Issuing
     // -------------------------------
     issueQueue.add(b1);
     issueQueue.add(b2);

     System.out.println("\nBooks queued for issuing:");
     for (Book b : issueQueue) System.out.println(b);

     // -------------------------------
     // 4. Issue Books
     // -------------------------------
     System.out.println("\nIssuing Books:");
     while (!issueQueue.isEmpty()) {
         Book issued = issueQueue.poll();
         System.out.println("Issued: " + issued);

         // After use, returned
         recentlyReturned.push(issued);
         System.out.println("Returned: " + issued);
     }

     // -------------------------------
     // 5. Re-issue Most Recently Returned Book
     // -------------------------------
     if (!recentlyReturned.isEmpty()) {
         Book reissued = recentlyReturned.pop();
         System.out.println("\nRe-issued Most Recent Book: " + reissued);
     }

     // -------------------------------
     // 6. Final Status
     // -------------------------------
     System.out.println("\nAll Books in Library:");
     for (Book b : allBooks) System.out.println(b);

     System.out.println("\nRegistered Members:");
     for (String m : members) System.out.println(m);

     System.out.println("\nBooks in Issue Queue:");
     for (Book b : issueQueue) System.out.println(b);

     System.out.println("\nBooks in Recently Returned Stack:");
     for (Book b : recentlyReturned) System.out.println(b);
 }

 // -------------------------------
 // Helper Methods
 // -------------------------------
 public static void registerMember(String memberId, Set<String> members) {
     if (members.contains(memberId)) {
         System.out.println("Member already registered: " + memberId);
     } else {
         members.add(memberId);
         System.out.println("Member registered: " + memberId);
     }
 }
}
