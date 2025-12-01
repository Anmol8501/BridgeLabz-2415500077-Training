package word_frequency_in_a_sentence;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful!";

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (var entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
