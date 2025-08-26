import java.util.*;
public class sum_using_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        int s = number*(number+1)/2;
        if (s==sum){
            System.out.println("same value of sum by both methods");
        }
    }
}
