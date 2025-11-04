package real_life_scenario.library.books;

public class Book {
    public String title, author;
    public int id;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void showBook() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}
