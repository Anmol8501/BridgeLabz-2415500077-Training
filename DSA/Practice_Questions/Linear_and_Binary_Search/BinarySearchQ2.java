package Linear_and_Binary_Search;

public class BinarySearchQ2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1};
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                System.out.println("Peak: " + arr[mid]);
                return;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
