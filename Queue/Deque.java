public class Deque {
    static Node front;
    static Node rear;
    public static void insertAtFront(int data){
        Node temp = new Node(data);
        if(front == null){
            front = temp;
            rear = temp;
            return;
        }
        temp.next = front;
        front.prev = temp;
        front = temp;
    }

    public static void insertAtRear(int data){
        Node newNode = new Node(data);
        if(rear == null){
            rear = newNode;
            front = newNode;
            return;
        }
        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;
    }

    public static void display(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void deleteAtFront(){
        if(front == null){
            System.out.println("Deque is empty");
            return;
        }
        if(front == rear){
            front = null;
            rear = null;
            return;
        }
        front = front.next;
        front.prev = null;
    }

    public static void deleteAtEnd(){
        if(rear == null){
            System.out.println("Deque is empty");
        }
        if(front == rear){
            front = null;
            rear = null;
            return;
        }
        rear = rear.prev;
        rear.next = null;
    }

    public static void main(String[] args){
        insertAtFront(20);
        insertAtRear(30);
        display();
        insertAtFront(10);
        insertAtRear(40);
        display();
        deleteAtFront();
        display(); 
        deleteAtEnd();
        display();        
    }
}

class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
