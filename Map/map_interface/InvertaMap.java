package map_interface;
import java.util.*;

public class InvertaMap {
	public static void main(String[] args) {
        Map<String, Integer> original = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> inverted = new HashMap<>();
        
        for (var entry : original.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }
        
        System.out.println(inverted);
    }
}
