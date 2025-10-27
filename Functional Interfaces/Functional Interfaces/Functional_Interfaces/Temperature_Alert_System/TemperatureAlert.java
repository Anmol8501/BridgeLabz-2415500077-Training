package Functional_Interfaces.Temperature_Alert_System;
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double threshold = 37.5;
        
        Predicate<Double> isHighTemp = temp -> temp > threshold;
        
        System.out.println("Enter current temperature:");
        double currentTemp = sc.nextDouble();
        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature crossed the threshold: " + currentTemp);
        } else {
            System.out.println("Temperature is normal: " + currentTemp);
        }
        
        sc.close();
    }
}