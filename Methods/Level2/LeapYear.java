import java.util.Scanner;
class LeapYear {
    public static boolean isLeap(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(isLeap(y) ? "Leap Year" : "Not Leap Year");
    }
}
