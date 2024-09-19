public class Book {
    private String name;
    private String author;
    private int copies;

    public Book(String name, String author, int copies) {
        this.name = name;
        this.author = author;
        this.copies = copies;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author + "', copies=" + copies + '}';
    }
}
