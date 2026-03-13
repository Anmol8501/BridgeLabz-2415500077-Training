package Circular_Linked_List_Online_Ticket_Reservation_System;

public class TicketCLL {

    Node head;

    public void add(int id, String c, String m, String s, String t) {
        Node n = new Node(id, c, m, s, t);

        if (head == null) {
            head = n;
            n.next = head;
            n.prev = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = n;
        n.next = head;
        n.prev = temp;
        head.prev = n;
    }

    public void remove(int id){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == head){
            if(head.id == id){
                head = null;
            }
            return;
        }

        Node temp = head;
        while(temp.next != head){
            if(temp.id == id){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }

        if(temp.id == id){
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp.next != head){
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie + " " + temp.seat + " " + temp.time);
            temp = temp.next;
        }
        System.out.println(temp.id + " " + temp.customer + " " + temp.movie + " " + temp.seat + " " + temp.time);
    }

    public void search(String customer, String movie){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp.next != head){
            if(temp.customer.equals(customer) || temp.movie.equals(movie)){
                System.out.println(temp.id + " " + temp.customer + " " + temp.movie + " " + temp.seat + " " + temp.time);
                return;
            }
            temp = temp.next;
        }

        if(temp.customer.equals(customer) || temp.movie.equals(movie)){
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie + " " + temp.seat + " " + temp.time);
        }
    }

    public void countTickets(String movie){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int count = 0;
        while(temp.next != head){
            if(temp.movie.equals(movie)){
                count++;
            }
            temp = temp.next;
        }

        if(temp.movie.equals(movie)){
            count++;
        }
        System.out.println("Total tickets for " + movie + " is " + count);
    }
}
