package Circular_Linked_List_Task_Scheduler;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Task Circular List -----");
        TaskCLL tasks = new TaskCLL();
        tasks.addFirst(1, "Submit Assignment", "High", "20 Feb");
        tasks.addFirst(2, "Project Work", "Medium", "25 Feb");
        tasks.addEnd(3, "Exam Preparation", "High", "28 Feb");
        tasks.addEnd(4, "Study", "Low", "1 Mar");
        tasks.addAtPosition(5, 5, "Revision", "Medium", "5 Mar");
        tasks.delete(1);
        tasks.displayCurrentTask();
        tasks.display();
        tasks.search("High");
    }
}
