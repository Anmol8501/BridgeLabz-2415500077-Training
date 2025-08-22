import java.util.*;
public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first double value: ");
        double a= sc.nextDouble();
        System.out.print("Enter second double value: ");
        double b = sc.nextDouble();
        System.out.println("Enter third double value: ");
        double c = sc.nextDouble();
        double result1= a + b * c;
        double result4= a % b + c;
        double result3= c + a / b;
        double result2= a * b + c;
        System.out.println("The results of Double Operations are: "+result1+", "+result2+", "+result3+" and "+result4 );
        sc.close();

    }
    
}
