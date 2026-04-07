public class CircularQueueUsingSinglyLinkedList{
    static Node front;
    static Node rear;
    static void enque(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
            rear.next = front;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }
    static void deque(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear){
            front = rear = null;
            return;
        }
        front = front.next;
        rear.next = front;
    }    
    
    static void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while(temp.next != front){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        enque(10);
        enque(20);
        enque(30);
        enque(40);
        display();
        deque();
        deque();
        display();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}