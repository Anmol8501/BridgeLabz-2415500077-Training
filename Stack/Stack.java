package Stack;

// Stack implementation using array
import java.util.Arrays;
public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack() {
        arr = new int[10];
        capacity = 10;
        top = -1;
    }

    // Add an element to the stack
    public void push(int x) {
        if (isFull()) {
            int size = arr.length;
            int[] NewArr = new int[size+(size/2)];
            System.arraycopy(arr, 0, NewArr, 0, size);
            capacity = size + (size/2);
            arr = NewArr;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public void display() {        
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.display();
        stack.push(11);
        stack.display();
        System.out.println("Popped: " + stack.pop());
    }
}