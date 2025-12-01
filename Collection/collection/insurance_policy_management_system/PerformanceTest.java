package insurance_policy_management_system;
import java.util.*;

public class PerformanceTest {

    public void runTest() {
        int N = 100000;

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long start, end;

        // Add
        start = System.nanoTime();
        for (int i = 0; i < N; i++) hashSet.add(i);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedHashSet.add(i);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) treeSet.add(i);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        // Search
        start = System.nanoTime();
        hashSet.contains(N - 1);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(N - 1);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(N - 1);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");
    }
}
