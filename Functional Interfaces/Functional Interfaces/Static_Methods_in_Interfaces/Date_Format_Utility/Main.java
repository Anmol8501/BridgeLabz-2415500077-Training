package Static_Methods_in_Interfaces.Date_Format_Utility;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        System.out.println("Default Format: " + IDateFormatterUtil.formatDate(today, "dd-MM-yyyy"));
        System.out.println("US Format: " + IDateFormatterUtil.formatDate(today, "MM/dd/yyyy"));
        System.out.println("Full Format: " + IDateFormatterUtil.formatDate(today, "EEEE, MMM dd yyyy"));
    }
}
