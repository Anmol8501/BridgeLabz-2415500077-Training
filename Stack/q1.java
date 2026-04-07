package Stack;

import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        push(stack,1);
        push(stack,2);
        push(stack,3);
        System.out.println(stack);
        pop(stack);
        System.out.println(stack);
    }

    public static void push(ArrayList<Integer> stack, int value) {
        stack.add(value);
    }

    public static int pop(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
}