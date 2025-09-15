import java.util.Random;
import java.util.Scanner;

public class MatrixOps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = randomMatrix(n, n);
        System.out.println("Matrix:");
        printMatrix(mat);

        System.out.println("Transpose:");
        printMatrix(transpose(mat));

        if (n == 2) {
            double det = determinant2x2(mat);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse2x2(mat));
            } else {
                System.out.println("Inverse does not exist.");
            }
        } else if (n == 3) {
            double det = determinant3x3(mat);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse3x3(mat));
            } else {
                System.out.println("Inverse does not exist.");
            }
        }
    }

    static int[][] randomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = mat[i][j];
        return t;
    }

    static double determinant2x2(int[][] a) {
        return a[0][0] * a[1][1] - a[0][1] * a[1][0];
    }

    static double determinant3x3(int[][] a) {
        return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
             - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
             + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;
        return inv;
    }

    static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;
        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;
        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;
        return inv;
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int v : row)
                System.out.printf("%6d", v);
            System.out.println();
        }
    }

    static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double v : row)
                System.out.printf("%8.3f", v);
            System.out.println();
        }
    }
}
