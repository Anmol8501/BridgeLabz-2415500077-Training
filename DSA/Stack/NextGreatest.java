package Stack;
import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = nextGreaterElements(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
