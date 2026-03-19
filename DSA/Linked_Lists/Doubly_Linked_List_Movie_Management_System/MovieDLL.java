package Doubly_Linked_List_Movie_Management_System;

class MovieDLL {
    MovieNode head = null;
    MovieNode tail = null;

    public void addFirst(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addFirst(title, director, year, rating);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;
        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void delete(String title) {
        if (head == null) return;
        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }
        MovieNode temp = head;
        while (temp.next != null && !temp.next.title.equalsIgnoreCase(title))
            temp = temp.next;
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) temp.next.prev = temp;
            else tail = temp;
        }
    }

    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found for this director.");
    }

    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with this rating.");
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        MovieNode temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        MovieNode temp = tail;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    private void printMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | Rating: " + m.rating);
    }
}
