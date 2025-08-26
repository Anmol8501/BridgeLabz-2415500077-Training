import java.util.*;
public class first_is_smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a < b && a < c) {
            System.out.println(a + " is the smallest number.");
        } else {
            System.out.println(a + " is not the smallest number.");
        }
        
        scanner.close();
    }
    
}
