package Circular_Linked_List_Task_Scheduler;

public class TaskCLL {

    Node head;

    public void addFirst(int id, String n, String p, String d) {
        Node newNode = new Node(id, n, p, d);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addEnd(int id, String n, String p, String d) {
        Node newNode = new Node(id, n, p, d);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int pos, int id, String n, String p, String d) {
        Node newNode = new Node(id, n, p, d);

        if (pos == 1) {
            addFirst(id, n, p, d);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) {
            if (head.id == id) {
                head = null;
                System.out.println("Task deleted successfully.");
                return;
            }
        }

        Node temp = head;
        Node prev = null;
        while (temp.next != head) {
            if (temp.id == id) {
                prev.next = temp.next;
                System.out.println("Task deleted successfully.");
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        if (temp.id == id) {
            prev.next = head;
            System.out.println("Task deleted successfully.");
            return;
        }

        System.out.println("Task not found.");
    }

    public void displayCurrentTask() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println(head.id + " | " + head.name + " | " + head.priority + " | " + head.due
            
        );
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            System.out.println(temp.id + " | " + temp.name + " | " + temp.priority + " | " + temp.due);
            temp = temp.next;
        }
        System.out.println(temp.id + " | " + temp.name + " | " + temp.priority + " | " + temp.due);
    }

    public void search(String priority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            if (temp.priority.equals(priority)) {
                System.out.println(temp.id + " | " + temp.name + " | " + temp.priority + " | " + temp.due);
                return;
            }
            temp = temp.next;
        }

        if (temp.priority.equals(priority)) {
            System.out.println(temp.id + " | " + temp.name + " | " + temp.priority + " | " + temp.due);
            return;
        }

        System.out.println("Task not found.");
    }
}
