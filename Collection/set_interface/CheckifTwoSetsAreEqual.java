package set_interface;
import java.util.*;

public class CheckifTwoSetsAreEqual {
	public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        boolean isEqual = set1.equals(set2);

        System.out.println("Are sets equal? " + isEqual);
    }
}
