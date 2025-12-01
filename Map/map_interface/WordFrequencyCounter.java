package map_interface;
import java.util.*;

public class WordFrequencyCounter {
	public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        
        text = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        
        String[] words = text.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();
        
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(freqMap);
    }
}
