package Doubly_Linked_List_Library_Management_System;

public class LibraryDLL {

    Node head, tail;

    public void addFirst(String t, String a, String g, int i, String s) {
        Node n = new Node(t, a, g, i, s);
        if (head == null)
            head = tail = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public void addLast(String t, String a, String g, int i, String s) {
        Node n = new Node(t, a, g, i, s);
        if (head == null)
            head = tail = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public void addAtPosition(int pos, String t, String a, String g, int i, String s) {
        Node n = new Node(t, a, g, i, s);
        if (pos == 0) {
            addFirst(t, a, g, i, s);
            return;
        }

        Node temp = head;
        for (int j = 0; j < pos - 1; j++) {
            temp = temp.next;
        }
        n.next = temp.next;
        n.prev = temp;
        temp.next.prev = n;
        temp.next = n;
    }

    public void remove(int id) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.id == id) {
            head = head.next;
            head.prev = null;
            return;
        }
        Node temp = head;
        while (temp != null && temp.id != id) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
            return;
        }
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void search(String title, String author) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title) && temp.author.equals(author)) {
                System.out.println("Book found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void update(int id, String title, String author, String genre, int year, String status) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.title = title;
                temp.author = author;
                temp.genre = genre;
                temp.status = status;
                System.out.println("Book updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void displayAscending() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.title + " " + current.author + " " + current.genre + " " + current.status);
            current = current.next;
        }
    }

    public void displayDescending() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail;
        while (current != null) {
            System.out.println(current.title + " " + current.author + " " + current.genre + " " + current.status);
            current = current.prev;
        }
    }

    public void countBooks() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Number of books: " + count);
    }
}
