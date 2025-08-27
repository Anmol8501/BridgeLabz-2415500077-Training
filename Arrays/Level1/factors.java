import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] factors = new int[n];
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[i - 1] = i;
                System.out.println(i);
            }
        }
        scanner.close();
    }
    
}
