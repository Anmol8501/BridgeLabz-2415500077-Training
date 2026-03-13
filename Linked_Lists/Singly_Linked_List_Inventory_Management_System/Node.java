package Singly_Linked_List_Inventory_Management_System;

public class Node {
    String name;
    int id, qty;
    double price;
    Node next;

    public Node(String n, int i, int q, double p) {
        name = n;
        id = i;
        qty = q;
        price = p;
    }
}
