package Stack;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    Node head = null;
    
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        } 
        Node newNode2 = new Node(data);
        newNode2.next = head;
        head = newNode2;
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        head = head.next;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void isEmpty(){
        if(head == null){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
    public static void main(String[] args) {
        Node stack = new Node(0); 
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
        stack.display();
        stack.isEmpty();

    }
}