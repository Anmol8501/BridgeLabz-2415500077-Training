package Stack;
import java.util.Stack;

public class prev_small {
    //fucntion to find previous smaller element in an array with help of stack
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int[] result = previousSmaller(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
    
}
