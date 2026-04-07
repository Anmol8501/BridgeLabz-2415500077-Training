package Stack;
import java.util.Stack;

public class next_small {
    //method to find next smallest element in an array with help of stack
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int[] result = nextSmaller(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
    
}
