package list_interface;
import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
    	List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Reverse ArrayList
        for (int i = 0, j = arrayList.size() - 1; i < j; i++, j--) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
        }

        // Reverse LinkedList
        for (int i = 0, j = linkedList.size() - 1; i < j; i++, j--) {
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j, temp);
        }

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
