public class N_Queens{
    static int n = 4;
    static int[] b = new int[n];

    static boolean ok(int r, int c) {
        for (int i = 0; i < r; i++) {
            if (b[i] == c || Math.abs(i - r) == Math.abs(b[i] - c))
                return false;
        }
        return true;
    }

    static boolean f(int r) {
        if (r == n) return true;
        for (int c = 0; c < n; c++) {
            if (ok(r, c)) {
                b[r] = c;
                if (f(r + 1)) return true;
            }
        }
        return false;
    }

    static void p() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] == j) System.out.print("Q ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        f(0);
        p();
    }
}
