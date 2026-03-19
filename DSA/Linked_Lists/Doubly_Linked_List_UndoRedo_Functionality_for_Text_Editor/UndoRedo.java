package Doubly_Linked_List_UndoRedo_Functionality_for_Text_Editor;

public class UndoRedo {
    private Node head;
    private Node tail;
    private Node current;
    private int size;
    private final int MAX_SIZE = 10;

    public UndoRedo() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public void addState(String text) {
        Node newNode = new Node(text);

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        if (current != tail) {
            Node temp = current.next;
            while (temp != null) {
                Node nextNode = temp.next;
                temp.prev = null;
                temp.next = null;
                temp = nextNode;
                size--;
            }
            current.next = null;
            tail = current;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}