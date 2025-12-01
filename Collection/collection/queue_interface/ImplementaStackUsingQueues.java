package queue_interface;
import java.util.*;

public class ImplementaStackUsingQueues {
	public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // PUSH 1, 2, 3
        for (int x : new int[]{1, 2, 3}) {
            q2.add(x);
            while (!q1.isEmpty()) q2.add(q1.remove());

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // POP
        System.out.println("Pop: " + q1.remove());

        // TOP
        System.out.println("Top: " + q1.peek());
    }
}
