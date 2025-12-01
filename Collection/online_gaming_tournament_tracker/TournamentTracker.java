package online_gaming_tournament_tracker;
import java.util.*;

public class TournamentTracker {
    public static void main(String[] args) {

        // --------------------------------------------------------
        // 1️⃣ DATA STRUCTURES
        // --------------------------------------------------------

        // Register unique players
        Set<String> players = new HashSet<>();

        // Queue for upcoming matches
        Queue<String> matchQueue = new LinkedList<>();

        // List to store match results
        List<String> results = new ArrayList<>();

        // TreeSet to show ranking (sorted by score DESCENDING)
        // Format: "Score - PlayerName"
        TreeSet<String> leaderboard = new TreeSet<>(Collections.reverseOrder());


        // --------------------------------------------------------
        // 2️⃣ REGISTER PLAYERS (Set → avoids duplicates)
        // --------------------------------------------------------
        System.out.println("Registering Players...");

        players.add("PlayerA");
        players.add("PlayerB");
        players.add("PlayerC");
        players.add("PlayerD");
        players.add("PlayerA"); // duplicate ignored

        System.out.println("Registered Players: " + players);


        // --------------------------------------------------------
        // 3️⃣ SCHEDULE MATCHES (Queue FIFO)
        // --------------------------------------------------------
        System.out.println("\nScheduling Matches...");

        matchQueue.add("Match1: PlayerA vs PlayerB");
        matchQueue.add("Match2: PlayerC vs PlayerD");
        matchQueue.add("Match3: Winner1 vs Winner2");

        System.out.println("Upcoming Matches: " + matchQueue);


        // --------------------------------------------------------
        // 4️⃣ PROCESS MATCHES & RECORD RESULTS
        // --------------------------------------------------------
        System.out.println("\nProcessing Matches...\n");

        int scoreA = 0, scoreB = 0, scoreC = 0, scoreD = 0;

        while (!matchQueue.isEmpty()) {
            String match = matchQueue.poll();
            System.out.println("Playing → " + match);

            // Simulated winners & scoring
            String winner = "";
            if (match.contains("PlayerA")) { winner = "PlayerA"; scoreA += 10; }
            if (match.contains("PlayerB")) { winner = "PlayerB"; scoreB += 5; }
            if (match.contains("PlayerC")) { winner = "PlayerC"; scoreC += 7; }
            if (match.contains("PlayerD")) { winner = "PlayerD"; scoreD += 3; }

            results.add("Result of " + match + " → Winner: " + winner);
            System.out.println("Winner: " + winner + "\n");
        }


        // --------------------------------------------------------
        // 5️⃣ UPDATE LEADERBOARD USING TreeSet
        // (Sorted in descending score order)
        // --------------------------------------------------------
        leaderboard.add(scoreA + " - PlayerA");
        leaderboard.add(scoreB + " - PlayerB");
        leaderboard.add(scoreC + " - PlayerC");
        leaderboard.add(scoreD + " - PlayerD");


        // --------------------------------------------------------
        // 6️⃣ DISPLAY RESULTS & LEADERBOARD
        // --------------------------------------------------------
        System.out.println("\nMatch Results:");
        for (String r : results) {
            System.out.println(r);
        }

        System.out.println("\n🏆 LIVE LEADERBOARD (HIGH → LOW)");
        for (String entry : leaderboard) {
            System.out.println(entry);
        }
    }
}
