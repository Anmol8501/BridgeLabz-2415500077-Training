package Circular_Linked_List_Round_Robin_Scheduling_Algorithm;

public class RoundRobin {

    Node head;

    public void add(int pid, int burst, String priority) {
        Node n = new Node(pid, burst, priority);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        Node t = head;
        while (t.next != head)
            t = t.next;
        t.next = n;
        n.next = head;
    }

    public void remove(int pid){
        Node temp = head;
        while(temp.next != head){
            if(temp.next.pid == pid){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void roundRobin(int quantum){
        Node temp = head;
        while(temp.next != head){
            if(temp.burst > quantum){
                temp.burst -= quantum;
                temp = temp.next;
            }else{
                remove(temp.pid);
                temp = temp.next;
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp.next != head){
            System.out.println(temp.pid + " " + temp.burst + " " + temp.priority);
            temp = temp.next;
        }
        System.out.println(temp.pid + " " + temp.burst + " " + temp.priority);
    }

    
}
