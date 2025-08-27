import java.util.*;
class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] age = new int[10];
        
        for (int i = 0; i < 10; i++) {
            age[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (age[i] >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }
        scanner.close();
    }
}