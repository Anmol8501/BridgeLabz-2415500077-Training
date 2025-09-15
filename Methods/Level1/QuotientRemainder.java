import java.util.Scanner;
class QuotientRemainder {
    public static int[] calculate(int n, int d) {
        return new int[]{n / d, n % d};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] res = calculate(n, d);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}
