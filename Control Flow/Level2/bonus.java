import java.util.*;
public class bonus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: ");
        int time=scanner.nextInt();
        if (time>=5){
            salary=salary+(0.05*salary);
        }
        System.out.println("The salary is: "+salary);
    }
}

