package Stack;
import java.util.Stack;

class nextGreatestFrequencyUsingStack{
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,2,1};
//        System.out.print(nextGreatestFrequency(arr));
        int[] ans = nextGreatestFrequency(arr);
        for (int x : ans) System.out.print(x + " ");
    }

    public static int[] nextGreatestFrequency(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] freq = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) freq[i]++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && freq[stack.peek()] <= freq[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return ans;
    }
}