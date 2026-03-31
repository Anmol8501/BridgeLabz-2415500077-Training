package Stack;

import java.util.Stack;

public class DeleteConsecutiveElements {
    public static void main(String[] args) {
        String[] arr = {"ab", "aa", "aa", "bad", "ab"};
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            if (!stack.isEmpty() && stack.peek().equals(s)) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }
        
        System.out.println(stack.size());
    }
}
