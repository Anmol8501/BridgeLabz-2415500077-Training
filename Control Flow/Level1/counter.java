import java.util.*;
public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        while (number != 0) {
            System.out.println(number);
            number--;
        }
    }
}
