public class Sum_of_Array {
    static int sum(int[] a, int n) {
        if (n == 0) return 0;
        return a[n - 1] + sum(a, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(sum(a, a.length));
    }
}
