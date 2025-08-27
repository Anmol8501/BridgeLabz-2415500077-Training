import java.util.*;
public class mean_height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
            sum += heights[i];
        }
        double mean = sum / 10.0;
        System.out.println("Mean height is: " + mean);
    }
}
