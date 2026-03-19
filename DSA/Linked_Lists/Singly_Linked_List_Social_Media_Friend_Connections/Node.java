package Singly_Linked_List_Social_Media_Friend_Connections;

import java.util.List;

public class Node {
    int id, age;
    String name;
    List<Integer> friendIds;
    Node next;

    public Node(int i, String n, int age, List<Integer> friendIds) {
        id = i;
        name = n;
        this.age = age;
        this.friendIds = friendIds;
    }
}
