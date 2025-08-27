import java.util.*;
public class checkingnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) {
                System.out.println("Negative number");
            } else if (numbers[i] > 0) {
                System.out.println("Positive number");
                if (numbers[i] % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }}
             else {
                System.out.println("Zero");
            }
            
        }
        if(numbers[0] == numbers[4]) {
            System.out.println("First and Last numbers are equal");
        } 
}}

