package list_interface;
import java.util.*;

public class FindtheNthElementfromtheEnd {
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast.next();
        }

        // Move both until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        System.out.println(slow.next()); // Nth from end
    }
}
