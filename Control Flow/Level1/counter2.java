import java.util.*;
public class counter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int i=number;i>0;i--) {
            System.out.println(number);
            number--;
        }
        scanner.close();
    }
}
