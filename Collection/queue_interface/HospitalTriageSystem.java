package queue_interface;
import java.util.*;

public class HospitalTriageSystem {
	public static void main(String[] args) {

	        // Using map entries instead of custom class
	        PriorityQueue<Map.Entry<String, Integer>> pq =
	                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

	        pq.add(Map.entry("John", 3));
	        pq.add(Map.entry("Alice", 5));
	        pq.add(Map.entry("Bob", 2));

	        while (!pq.isEmpty()) {
	            System.out.println(pq.remove().getKey());
	        }
	    }
}
