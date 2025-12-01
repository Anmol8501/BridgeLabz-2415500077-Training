package online_streaming_watch_history;
import java.util.*;

//-------------------------------
//Movie Class
//-------------------------------
class Movie {
 String title;
 String genre;

 public Movie(String title, String genre) {
     this.title = title;
     this.genre = genre;
 }

 @Override
 public String toString() {
     return title + " (" + genre + ")";
 }
}

//-------------------------------
//Main Class
//-------------------------------
public class StreamingWatchHistory {
 public static void main(String[] args) {

     // -------------------------------
     // Data Structures
     // -------------------------------
     Stack<Movie> watchedHistory = new Stack<>();
     List<Movie> allMovies = new ArrayList<>();
     Set<String> uniqueGenresWatched = new HashSet<>();
     Queue<Movie> upNextQueue = new LinkedList<>();

     // -------------------------------
     // 1. Add Movies to "Up Next" Queue
     // -------------------------------
     Movie m1 = new Movie("Inception", "Sci-Fi");
     Movie m2 = new Movie("The Dark Knight", "Action");
     Movie m3 = new Movie("Interstellar", "Sci-Fi");
     Movie m4 = new Movie("La La Land", "Romance");

     upNextQueue.add(m1);
     upNextQueue.add(m2);
     upNextQueue.add(m3);
     upNextQueue.add(m4);

     // Also maintain all available movies
     allMovies.addAll(Arrays.asList(m1, m2, m3, m4));

     System.out.println("=== Up Next Queue ===");
     for (Movie m : upNextQueue) System.out.println(m);

     // -------------------------------
     // 2. Play movies and move to watched stack
     // -------------------------------
     System.out.println("\n=== Playing Movies ===");
     while (!upNextQueue.isEmpty()) {
         Movie current = upNextQueue.poll();
         System.out.println("Watching → " + current);
         watchedHistory.push(current);
         uniqueGenresWatched.add(current.genre);
     }

     // -------------------------------
     // 3. Display Watched History and Unique Genres
     // -------------------------------
     System.out.println("\n=== Watched History (Most Recent on Top) ===");
     for (Movie m : watchedHistory) System.out.println(m);

     System.out.println("\n=== Unique Genres Watched ===");
     for (String genre : uniqueGenresWatched) System.out.println(genre);

     // -------------------------------
     // 4. Display Recommendations based on watched genres
     // -------------------------------
     System.out.println("\n=== Recommendations Based on Watched Genres ===");
     for (Movie m : allMovies) {
         if (!watchedHistory.contains(m) && uniqueGenresWatched.contains(m.genre)) {
             System.out.println(m);
         }
     }
 }
}
