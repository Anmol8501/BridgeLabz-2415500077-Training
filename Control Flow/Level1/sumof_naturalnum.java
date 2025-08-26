import java.util.*;
public class sumof_naturalnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        if (n > 0 ) {
           
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        scanner.close();}
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
    
}
