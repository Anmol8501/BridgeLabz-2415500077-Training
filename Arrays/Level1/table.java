import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
