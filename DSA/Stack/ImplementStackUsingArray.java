package Stack;

public class ImplementStackUsingArray {
    int[] stack;
    int top;
    int capacity;

    ImplementStackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
    }
}
