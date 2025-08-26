import java.util.*;
public class sum_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        int s= n*(n+1)/2;
        if (s==sum){
            System.out.println("Same sum value by both method");
        }
        
    }
}
