package Circular_Linked_List_Round_Robin_Scheduling_Algorithm;

public class Node {
    int pid, burst;
    String priority;
    Node next;

    public Node(int p, int b, String priority) {
        pid = p;
        burst = b;
        this.priority = priority;
    }
}
