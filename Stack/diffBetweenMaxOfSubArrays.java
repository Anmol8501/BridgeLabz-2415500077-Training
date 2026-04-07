package Stack;
import java.util.Stack;

public class diffBetweenMaxOfSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int k = 3;
        int[] result = diffBtwMaxOfSubArrays(arr, k);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }    

    public static int[] diffBtwMaxOfSubArrays(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            stack.push(i);

            if (i >= k - 1) {
                result[i - k + 1] = arr[stack.peek()] - arr[i - k + 1];
                if (stack.peek() == i - k + 1) {
                    stack.pop();
                }
            }
        }
        return result;
    }
}
