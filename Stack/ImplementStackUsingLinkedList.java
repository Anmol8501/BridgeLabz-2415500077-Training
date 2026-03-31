package Stack;

public class ImplementStackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node head = null;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        
        System.out.println("Top element: " + peek()); 
        System.out.println("Popped element: " + pop()); 
        System.out.println("Top element after pop: " + peek()); 
    }
}
