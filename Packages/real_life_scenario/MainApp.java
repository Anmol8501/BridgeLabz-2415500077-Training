package real_life_scenario;
import real_life_scenario.library.books.*;
import real_life_scenario.library.members.*;
import real_life_scenario.library.transactions.*;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book(101, "Java Basics", "Herbert Schildt");
        Member m = new Member(1, "Alice");
        Transaction t = new Transaction();

        b.showBook();
        m.showMember();
        t.issueBook(b, m);
    }
}
