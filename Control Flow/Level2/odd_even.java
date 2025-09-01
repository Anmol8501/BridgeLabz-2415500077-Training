import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");       
        int number = scanner.nextInt();
        for (int i=1;i<=number;i++){
            if (i%2==0){
                System.out.println(i+" is even");
            }
            else {
                System.out.println(i+" is odd");
            }
        }
    }
}


