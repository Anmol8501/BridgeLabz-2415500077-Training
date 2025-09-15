import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        printCalendar(month, year);
    }

    static void printCalendar(int month, int year) {
        System.out.printf("%s %d\n", months[month - 1], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int days = getDaysInMonth(month, year);
        int startDay = getStartDay(month, year);

        for (int i = 0; i < startDay; i++)
            System.out.printf("    ");

        for (int date = 1; date <= days; date++) {
            System.out.printf("%3d ", date);
            if ((date + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year))
            return 29;
        return daysInMonth[month - 1];
    }

    static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        if (year % 100 != 0)
            return true;
        return year % 400 == 0;
    }

    static int getStartDay(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int d = 1;
        int k = y % 100;
        int j = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        return (h + 6) % 7;
    }
}
