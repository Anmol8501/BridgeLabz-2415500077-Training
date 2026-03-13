package Singly_Linked_List_Inventory_Management_System;

public class InventoryList {

    Node head;

    public void addFirst(String n, int id, int q, double p) {
        Node newNode = new Node(n, id, q, p);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String n, int id, int q, double p) {
        Node newNode = new Node(n, id, q, p);
        if (head == null) {
            head = newNode;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = newNode;
    }

    public void addAtPosition(int pos, String n, int id, int q, double p) {
        Node newNode = new Node(n, id, q, p);
        if (pos == 0) {
            addFirst(n, id, q, p);
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1; i++) {
            t = t.next;
        }
        newNode.next = t.next;
        t.next = newNode;
    }

    public void remove(int id){
        Node t = head;
        Node prev = null;
        while(t != null && t.id != id){
            prev = t;
            t = t.next;
        }
        if(t == null){
            System.out.println("Item not found.");
            return;
        }
        if(prev == null){
            head = t.next;
        }else{
            prev.next = t.next;
        }
    }

    public void update(int id, int q){
        Node t = head;
        while(t != null && t.id != id){
            t = t.next;
        }
        if(t == null){
            System.out.println("Item not found.");
            return;
        }
        t.qty = q;
    }

    public void search(int id, String name){
        Node t = head;
        while(t != null && t.id != id && t.name != name){
            t = t.next;
        }
        if(t == null){
            System.out.println("Item not found.");
            return;
        }
        System.out.println("Item found.");
        System.out.println("Name: " + t.name + ", ID: " + t.id + ", Quantity: " + t.qty + ", Price: " + t.price);
    }

    public double totalValue() {
        double sum = 0;
        Node t = head;
        while (t != null) {
            sum += t.qty * t.price;
            t = t.next;
        }
        return sum;
    }

    public void sortAscending() {
        if (head == null || head.next == null) {
            return;
        }

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.price > j.price) {
                    String tempName = i.name;
                    int tempId = i.id;
                    int tempQty = i.qty;
                    double tempPrice = i.price;

                    i.name = j.name;
                    i.id = j.id;
                    i.qty = j.qty;
                    i.price = j.price;

                    j.name = tempName;
                    j.id = tempId;
                    j.qty = tempQty;
                    j.price = tempPrice;
                }
            }
        }
    }

    public void sortDescending() {
        if (head == null || head.next == null) {
            return;
        }

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.price < j.price) {
                    String tempName = i.name;
                    int tempId = i.id;
                    int tempQty = i.qty;
                    double tempPrice = i.price;

                    i.name = j.name;
                    i.id = j.id;
                    i.qty = j.qty;
                    i.price = j.price;

                    j.name = tempName;
                    j.id = tempId;
                    j.qty = tempQty;
                    j.price = tempPrice;
                }
            }
        }
    }
}