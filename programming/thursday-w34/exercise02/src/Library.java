import java.util.ArrayList;

public class Library {
    ArrayList<Book> shelves = new ArrayList<>();

    public void addBook(Book book) {
        shelves.add(book);
    }

    public boolean findBook(String isbnNumber) {
        for (Book item: shelves) {
            if(item.getISBNNumber().equals(isbnNumber)) {
                System.out.println("Found: " + item.getTitle());
                return true;
            }
        }
        return false;
    }

    public String toString() {
        for (Book book : shelves) {
            System.out.println(book);
        }
    return "";
    }
}
