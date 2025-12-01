package customer_feedback_analysis;
import java.util.*;

//-------------------------------
//Main Class
//-------------------------------
public class CustomerFeedbackAnalysis {
 public static void main(String[] args) {

     // -------------------------------
     // Data Structures
     // -------------------------------
     List<String> allFeedbacks = new ArrayList<>();
     Set<String> uniqueFeedbacks = new HashSet<>();
     Queue<String> feedbackQueue = new LinkedList<>();
     Stack<String> recentFeedbacks = new Stack<>();

     // -------------------------------
     // 1. Add feedback messages
     // -------------------------------
     allFeedbacks.add("Great service!");
     allFeedbacks.add("Delivery was late");
     allFeedbacks.add("Great service!"); // duplicate
     allFeedbacks.add("Excellent support");
     allFeedbacks.add("Needs improvement");

     System.out.println("All Feedback Entries:");
     for (String f : allFeedbacks) System.out.println(f);

     // -------------------------------
     // 2. Remove duplicates and process sequentially
     // -------------------------------
     System.out.println("\nProcessing Feedbacks (duplicates removed):");
     for (String f : allFeedbacks) {
         if (!uniqueFeedbacks.contains(f)) {
             uniqueFeedbacks.add(f);
             feedbackQueue.add(f);
             recentFeedbacks.push(f);
             System.out.println("Processed: " + f);
         } else {
             System.out.println("Duplicate skipped: " + f);
         }
     }

     // -------------------------------
     // 3. Display last few feedbacks using stack
     // -------------------------------
     System.out.println("\nLast few feedbacks (Most Recent on Top):");
     while (!recentFeedbacks.isEmpty()) {
         System.out.println(recentFeedbacks.pop());
     }

     // -------------------------------
     // Optional: Remaining Feedback Queue
     // -------------------------------
     System.out.println("\nRemaining Feedbacks in Queue:");
     for (String f : feedbackQueue) System.out.println(f);
 }
}
