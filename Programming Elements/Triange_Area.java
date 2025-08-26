import java.util.*;
public class Triange_Area {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle in cm: ");
        double base= sc.nextDouble();
        double height= sc.nextDouble();
        double area= 0.5*base*height;
        double area_in_inches= area/(2.54*2.54);
        System.out.println("Area of the triangle in square cm: " + area);
        System.out.println("Area of the triangle in square inches: " + area_in_inches);
    }
}
