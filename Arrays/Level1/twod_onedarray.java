import java.util.*;
public class twod_onedarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array2D = new int[3][3];
        int[] array1D = new int[9];
        int index = 0;
        System.out.println("Enter 9 elements for 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = scanner.nextInt();
                array1D[index++] = array2D[i][j];
            }
        }
        System.out.println("1D Array elements:");
        for (int i = 0; i < 9; i++) {
            System.out.print(array1D[i] + " ");
        }
    }
}
