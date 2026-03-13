public class Word_Search {
    static char[][] a = {
        {'C','A','T','S'},
        {'O','R','E','A'},
        {'D','E','A','M'},
        {'E','L','L','S'}
    };
    static boolean[][] v = new boolean[4][4];
    static String w = "DREAM";

    static boolean f(int i, int j, int k) {
        if (k == w.length()) return true;
        if (i < 0 || j < 0 || i >= 4 || j >= 4 || v[i][j] || a[i][j] != w.charAt(k))
            return false;

        v[i][j] = true;
        boolean r = f(i + 1, j, k + 1) || f(i - 1, j, k + 1) ||
                    f(i, j + 1, k + 1) || f(i, j - 1, k + 1);
        v[i][j] = false;
        return r;
    }
    public static void main(String[] args) {
        boolean ok = false;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (f(i, j, 0)) ok = true;

        System.out.println(ok);
    }
}
