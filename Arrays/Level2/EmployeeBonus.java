import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Step 1: Take input for 10 employees
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Salary input with validation
            System.out.print("Enter salary: ");
            double s = sc.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--; // repeat this employee
                continue;
            }

            // Years of service input with validation
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();
            if (y < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--; // repeat this employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Step 2: Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Print employee details
        System.out.println("\n----- Employee Salary Details -----");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        // Step 4: Print totals
        System.out.println("\n----- Company Totals -----");
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);

        sc.close();
    }
}

