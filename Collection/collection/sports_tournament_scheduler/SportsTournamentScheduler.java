package sports_tournament_scheduler;
import java.util.*;

//-------------------------------
//Team Class
//-------------------------------
class Team implements Comparable<Team> {
 String name;
 int points;

 public Team(String name) {
     this.name = name;
     this.points = 0;
 }

 @Override
 public int compareTo(Team other) {
     // Descending points; if points equal, sort by name
     int cmp = Integer.compare(other.points, this.points);
     return (cmp == 0) ? this.name.compareTo(other.name) : cmp;
 }

 @Override
 public String toString() {
     return name + " | Points: " + points;
 }

 @Override
 public boolean equals(Object obj) {
     if (!(obj instanceof Team)) return false;
     return this.name.equals(((Team) obj).name);
 }

 @Override
 public int hashCode() {
     return Objects.hash(name);
 }
}

//-------------------------------
//Match Class
//-------------------------------
class Match {
 Team team1;
 Team team2;

 public Match(Team t1, Team t2) {
     this.team1 = t1;
     this.team2 = t2;
 }

 @Override
 public String toString() {
     return team1.name + " vs " + team2.name;
 }
}

//-------------------------------
//Result Class
//-------------------------------
class Result {
 Match match;
 Team winner;

 public Result(Match match, Team winner) {
     this.match = match;
     this.winner = winner;
 }

 @Override
 public String toString() {
     return match + " → Winner: " + winner.name;
 }
}

//-------------------------------
//Main Class
//-------------------------------
public class SportsTournamentScheduler {
 public static void main(String[] args) {

     // -------------------------------
     // Data Structures
     // -------------------------------
     Set<Team> registeredTeams = new HashSet<>();
     Queue<Match> matchQueue = new LinkedList<>();
     List<Result> results = new ArrayList<>();
     TreeSet<Team> leaderboard = new TreeSet<>();

     // -------------------------------
     // 1. Register Teams
     // -------------------------------
     Team t1 = new Team("Lions");
     Team t2 = new Team("Tigers");
     Team t3 = new Team("Bears");
     Team t4 = new Team("Wolves");

     registeredTeams.addAll(Arrays.asList(t1, t2, t3, t4));

     System.out.println("Registered Teams:");
     for (Team t : registeredTeams) System.out.println(t);

     // -------------------------------
     // 2. Schedule Matches
     // -------------------------------
     matchQueue.add(new Match(t1, t2));
     matchQueue.add(new Match(t3, t4));
     matchQueue.add(new Match(t1, t3));
     matchQueue.add(new Match(t2, t4));

     System.out.println("\nScheduled Matches:");
     for (Match m : matchQueue) System.out.println(m);

     // -------------------------------
     // 3. Process Matches
     // -------------------------------
     Random rand = new Random();
     while (!matchQueue.isEmpty()) {
         Match m = matchQueue.poll();

         // Random winner for demonstration
         Team winner = rand.nextBoolean() ? m.team1 : m.team2;
         winner.points += 3; // 3 points per win
         Result res = new Result(m, winner);
         results.add(res);
         System.out.println("Match Played: " + res);
     }

     // -------------------------------
     // 4. Display Leaderboard
     // -------------------------------
     leaderboard.addAll(registeredTeams);
     System.out.println("\n=== Leaderboard (Sorted by Points) ===");
     for (Team t : leaderboard) System.out.println(t);
 }
}
