package Circular_Linked_List_Round_Robin_Scheduling_Algorithm;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Round Robin -----");
        RoundRobin rr = new RoundRobin();
        rr.add(1, 10, "High");
        rr.add(2, 5, "Medium");
        rr.add(3, 8, "Low");
        rr.remove(1);
        rr.roundRobin(2);
        rr.display();
    }
}
