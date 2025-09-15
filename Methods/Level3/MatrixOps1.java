import java.util.Random;
import java.util.Scanner;

public class MatrixOps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        int[][] matrix1 = randomMatrix(rows1, cols1);
        int[][] matrix2 = randomMatrix(rows2, cols2);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Addition:");
            printMatrix(addMatrix(matrix1, matrix2));
            System.out.println("Subtraction:");
            printMatrix(subtractMatrix(matrix1, matrix2));
        } else {
            System.out.println("Addition and Subtraction not possible. Size mismatch.");
        }

        if (cols1 == rows2) {
            System.out.println("Multiplication:");
            printMatrix(multiplyMatrix(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible.");
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

    static int[][] addMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    static int[][] subtractMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, n = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }
}
