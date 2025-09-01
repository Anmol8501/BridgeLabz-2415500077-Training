import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a) Take input for weight (kg) and height (cm)
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100.0;

        // Step b) Calculate BMI using formula: weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Step c) Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
