import java.util.Scanner;
class ChocolateDivision {
    public static int[] divide(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = divide(chocolates, children);
        System.out.println("Each child: " + res[0] + ", Remaining: " + res[1]);
    }
}
