import java.util.*;
public class largest_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
            System.out.println("First num is the largest number.");
        } else if (b > a && b > c) {
            System.out.println("Second num is the largest number.");
        } else {
            System.out.println( "Third num is the largest number.");
        }
        
        scanner.close();
    }

}
