package map_interface;
import java.util.*;

public class MergeTwoMaps {
	public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        
        map2.forEach((k, v) -> map1.merge(k, v, Integer::sum));
        
        System.out.println(map1);
    }
}
