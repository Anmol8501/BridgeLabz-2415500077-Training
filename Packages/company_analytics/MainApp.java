package company_analytics;

import company_analytics.com.company.analytics.hr.EmployeeReport;
import company_analytics.com.company.analytics.sales.SalesReport;

public class MainApp {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        System.out.println("=== Company Report ===");
        s.printSales();
        e.printEmployees();
    }
}
