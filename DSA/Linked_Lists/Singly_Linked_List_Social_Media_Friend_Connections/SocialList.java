package Singly_Linked_List_Social_Media_Friend_Connections;

import java.util.List;

public class SocialList {

    Node head;

    public void addConnection(int id, String name, int age, List<Integer> friendIds) {
        Node n = new Node(id, name, age, friendIds);
        n.next = head;
        head = n;
    }

    public void removeConnection(int id) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void findMutualFriends(int id1, int id2) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id1) {
                Node temp2 = head;
                while (temp2 != null) {
                    if (temp2.id == id2) {
                        for (int i = 0; i < temp.friendIds.size(); i++) {
                            for (int j = 0; j < temp2.friendIds.size(); j++) {
                                if (temp.friendIds.get(i) == temp2.friendIds.get(j)) {
                                    System.out.println(temp.friendIds.get(i));
                                }
                            }
                        }
                    }
                    temp2 = temp2.next;
                }
            }
            temp = temp.next;
        }
    }

    public void displayFriends(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                for (int i = 0; i < temp.friendIds.size(); i++) {
                    System.out.println(temp.friendIds.get(i));
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void search(String name, int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name) && temp.id == id) {
                System.out.println(temp.id + " " + temp.name + " " + temp.age + " " + temp.friendIds);
                return;
            }
            temp = temp.next;
        }
    }

    public void countFriends(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println(temp.friendIds.size());
                return;
            }
            temp = temp.next;
        }
    }

    public void displayAll(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.id + " " + temp.name + " " + temp.age + " " + temp.friendIds);
            temp = temp.next;
        }
    }
}