package real_life_scenario.library.transactions;
import real_life_scenario.library.books.Book;
import real_life_scenario.library.members.Member;

public class Transaction {
    public void issueBook(Book b, Member m) {
        System.out.println("Issued " + b.title + " to " + m.name);
    }
}
