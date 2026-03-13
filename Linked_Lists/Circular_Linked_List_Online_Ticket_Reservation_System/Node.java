package Circular_Linked_List_Online_Ticket_Reservation_System;

public class Node {
    int id;
    String customer, movie, seat, time;
    Node next, prev;

    public Node(int i, String c, String m, String s, String t) {
        id = i;
        customer = c;
        movie = m;
        seat = s;
        time = t;   
    }

}
