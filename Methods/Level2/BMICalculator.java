import java.util.Scanner;
class BMICalculator {
    public static double calculateBMI(double w, double h) {
        double heightInMeters = h / 100;
        return w / (heightInMeters * heightInMeters);
    }
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            double bmi = calculateBMI(w, h);
            data[i][0] = w;
            data[i][1] = h;
            data[i][2] = bmi;
            status[i] = getStatus(bmi);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + data[i][0] + ", Height: " + data[i][1] + ", BMI: " + data[i][2] + ", Status: " + status[i]);
        }
    }
}
