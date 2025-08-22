import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a= sc.nextInt();
        System.out.println("Enter the second integer: ");
        int b= sc.nextInt();
        System.out.println("Enter the third integer: ");
        int c= sc.nextInt();
        int result1= a + b * c;
        int result4= a % b + c;
        int result3= c + a / b;
        int result2= a * b + c;
        System.out.println("The results of Int Operations are: "+result1+", "+result2+", "+result3+" and "+result4 );
        
        
    }
    
}
