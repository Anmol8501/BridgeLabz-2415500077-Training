package Doubly_Linked_List_Library_Management_System;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Library -----");
        LibraryDLL library = new LibraryDLL();
        library.addFirst("Java Book", "Herbert", "Programming", 1, "Available");
        library.addLast("DSA Book", "Cormen", "Algorithms", 2, "Issued");
        library.addAtPosition(1, "Python Book", "John", "Programming", 3, "Available");
        library.remove(3);
        library.search("Java Book", "Herbert");
        library.update(1, "Java Book", "Herbert", "Programming", 1, "Issued");
        library.displayAscending();
        library.displayDescending();
        library.countBooks();
    }
}
