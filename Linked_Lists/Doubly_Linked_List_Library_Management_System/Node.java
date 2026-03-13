package Doubly_Linked_List_Library_Management_System;

public class Node {
    String title, author, genre, status;
    int id;
    Node next, prev;

    public Node(String t, String a, String g, int i, String s) {
        title = t;
        author = a;
        genre = g;
        id = i;
        status = s;
    }
}
