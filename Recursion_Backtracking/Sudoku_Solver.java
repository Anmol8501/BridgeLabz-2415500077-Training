public class Sudoku_Solver {
    static boolean f(int[][] a, int r, int c) {
        if (r == 9) return true;
        if (c == 9) return f(a, r + 1, 0);
        if (a[r][c] != 0) return f(a, r, c + 1);

        for (int k = 1; k <= 9; k++) {
            if (ok(a, r, c, k)) {
                a[r][c] = k;
                if (f(a, r, c + 1)) return true;
                a[r][c] = 0;
            }
        }
        return false;
    }

    static boolean ok(int[][] a, int r, int c, int k) {
        for (int i = 0; i < 9; i++) {
            if (a[r][i] == k || a[i][c] == k) return false;
        }
        int x = r - r % 3, y = c - c % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (a[x + i][y + j] == k) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        f(a, 0, 0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}


