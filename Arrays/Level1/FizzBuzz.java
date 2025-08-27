import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] fizzbuzz = new String[n+1];
        for (int i = 0; i <= n+1; i++) {
            if (i % 3 == 0) {
                fizzbuzz[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzbuzz[i] = "Buzz";   
            }
            else{
                fizzbuzz[i] = String.valueOf(i);
            }
        }
        for (int j=1;j<n+1;j++){
            System.out.println(fizzbuzz[j]);
        }
        scanner.close();
    }
}
