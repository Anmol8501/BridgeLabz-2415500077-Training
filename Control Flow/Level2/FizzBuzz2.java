import java.util.*;
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();
           while (i%3!=0 && i%5!=0){
               System.out.println(i);
               break;
           }
           while (i%3==0 && i%5==0){
               System.out.println("FizzBuzz");
               break;
           }
           while (i%3==0){
               System.out.println("Fizz");
               break;
           }    
              while (i%5==0){
                System.out.println("Buzz");
                break;
              }
        }
    }

