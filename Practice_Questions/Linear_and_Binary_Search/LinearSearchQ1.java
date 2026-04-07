package Linear_and_Binary_Search;

public class LinearSearchQ1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, -2, 4};

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
