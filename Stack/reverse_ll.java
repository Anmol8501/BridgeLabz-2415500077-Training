package Stack;

public class reverse_ll {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        head = listReverse(head);

        System.out.println("Reversed List:");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }    

    public static Node listReverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next;
        }
        head = prev; 
        System.out.println("Reversed List:");
        return head;   
    }
}
