package Doubly_Linked_List_Movie_Management_System;

public class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    public MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}
