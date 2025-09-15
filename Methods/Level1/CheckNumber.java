import java.util.Scanner;
class CheckNumber {
    public static int check(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}
