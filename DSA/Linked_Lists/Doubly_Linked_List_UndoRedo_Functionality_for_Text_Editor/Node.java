package Doubly_Linked_List_UndoRedo_Functionality_for_Text_Editor;

public class Node {
    String text;
    Node next, prev;

    public Node(String t) {
        text = t;
        this.next = null;
        this.prev = null;
    }
}
