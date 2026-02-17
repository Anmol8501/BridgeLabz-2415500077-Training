public class Subset_Sum {
    static boolean sum(int[] a, int i, int s, int t) {
        if (s == t) return true;
        if (i == a.length || s > t) return false;
        if (sum(a, i + 1, s + a[i], t)) return true;
        return sum(a, i + 1, s, t);
    }

    public static void main(String[] args) {
        int[] a = {3, 34, 4, 12, 5, 2};
        int t = 9;
        System.out.println(sum(a, 0, 0, t));
    }
}
