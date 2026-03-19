package Linear_and_Binary_Search;

public class BinarySearchQ1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Rotation index: " + left);
    }
}
