package voting_count_in_an_election;
import java.util.*;

public class ElectionVoteCounter {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        List<String> voteList = Arrays.asList(
            "Amit", "Riya", "Amit", "Sohan", "Riya",
            "Amit", "Priya", "Sohan", "Amit", "Riya"
        );

        for (String candidate : voteList) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        System.out.println("Vote Count:");
        for (var entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        Map.Entry<String, Integer> winner =
                Collections.max(votes.entrySet(), Map.Entry.comparingByValue());

        System.out.println("\nWinner: " + winner.getKey() +
                " (" + winner.getValue() + " votes)");
    }
}
