import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
        // Adding some static data
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", 3));
        books.put("1984", new Book("1984", "George Orwell", 2));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", 1));
    }

    public boolean isBookAvailable(String bookName) {
        Book book = books.get(bookName);
        if (book != null && book.getCopies() > 0) {
            return true;
        }
        return false;
    }

    public void searchBook(String bookName) {
        Book book = books.get(bookName);
        if (book != null) {
            System.out.println("Book Found: " + book);
            System.out.println("Available: " + (isBookAvailable(bookName) ? "Yes" : "No"));
        } else {
            System.out.println("Book not found.");
        }
    }
}

