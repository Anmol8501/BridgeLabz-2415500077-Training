package Stack;
import java.util.*;

class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class circularTour {
    
    static int findStartingPump(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            surplus += pumps[current].petrol - pumps[current].distance;

            if (surplus < 0) {
                queue.add(current);
                deficit += surplus;
                surplus = 0;
                start = (start + 1) % n;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 3),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 4)
        };

        int start = findStartingPump(pumps);
        if (start != -1) {
            System.out.println("Starting pump: " + start);
        } else {
            System.out.println("No solution exists");
        }
    }
}