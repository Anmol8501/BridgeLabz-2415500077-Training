public class Rat_in_Maze {
    static int n = 4;
    static int[][] m = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };
    static int[][] v = new int[n][n];

    static boolean f(int i, int j) {
        if (i == n - 1 && j == n - 1) {
            v[i][j] = 1;
            return true;
        }
        if (i >= 0 && j >= 0 && i < n && j < n && m[i][j] == 1 && v[i][j] == 0) {
            v[i][j] = 1;
            if (f(i + 1, j)) return true;
            if (f(i, j + 1)) return true;
            v[i][j] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        f(0, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(v[i][j] + " ");
            System.out.println();
        }
    }
}
