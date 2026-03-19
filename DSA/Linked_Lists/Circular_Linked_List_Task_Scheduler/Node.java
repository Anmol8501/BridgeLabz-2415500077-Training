package Circular_Linked_List_Task_Scheduler;

public class Node {
    int id;
    String name, priority, due;
    Node next;

    public Node(int i, String n, String p, String d) {
        id = i;
        name = n;
        priority = p;
        due = d;
    }
}
