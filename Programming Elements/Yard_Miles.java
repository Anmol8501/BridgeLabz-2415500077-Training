import java.util.Scanner;

public class Yard_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // 1 yard = 3 feet
        double yards = feet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        System.out.println("Distance in feet: " + feet);
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}