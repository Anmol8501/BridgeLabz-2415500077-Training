package Singly_Linked_List_Student_Record_Management;

public class StudentList {

    Node head;

    public void addFirst(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int roll, String n, int a, String g, int pos) {
        Node newNode = new Node(roll, n, a, g);
        if (pos == 1) {
            addFirst(roll, n, a, g);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete(int roll) {
        if (head == null)
            return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name);
            temp = temp.next;
        }
    }

    public void update(int roll, String n, int a, String g) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.name = n;
                temp.age = a;
                temp.grade = g;
                return;
            }
            temp = temp.next;
        }
    }
}
