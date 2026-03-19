package Doubly_Linked_List_Movie_Management_System;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Movie DLL -----");
        MovieDLL movies = new MovieDLL();
        movies.addFirst("Inception", "Nolan", 2010, 9.0);
        movies.addFirst("Interstellar", "Nolan", 2014, 9.5);
        movies.addLast("The Dark Knight", "Nolan", 2008, 9.2);
        movies.addLast("The Dark Knight Rises", "Nolan", 2012, 8.9);
        movies.addAtPosition(2, "The Prestige", "Nolan", 2006, 8.8);
        movies.delete("The Dark Knight");
        movies.searchByDirector("Nolan");
        movies.searchByRating(9.0);
        movies.updateRating("Inception", 9.0);
        movies.displayForward();
        movies.displayReverse();
    }
}
