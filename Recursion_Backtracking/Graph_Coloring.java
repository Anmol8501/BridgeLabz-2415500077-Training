public class Graph_Coloring {
    static int[][] g = {
        {0,1,1,1},
        {1,0,1,0},
        {1,1,0,1},
        {1,0,1,0}
    };
    static int n = 4, m = 3;
    static int[] c = new int[n];

    static boolean ok(int v, int col) {
        for (int i = 0; i < n; i++)
            if (g[v][i] == 1 && c[i] == col)
                return false;
        return true;
    }

    static boolean f(int v) {
        if (v == n) return true;
        for (int col = 1; col <= m; col++) {
            if (ok(v, col)) {
                c[v] = col;
                if (f(v + 1)) return true;
                c[v] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        f(0);
        for (int i = 0; i < n; i++)
            System.out.print(c[i] + " ");
    }
}
