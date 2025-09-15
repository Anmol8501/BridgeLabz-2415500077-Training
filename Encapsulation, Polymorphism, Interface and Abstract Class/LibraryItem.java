abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String userId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved by " + userId);
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String userId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved by " + userId);
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String userId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved by " + userId);
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}
