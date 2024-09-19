    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System");
        while (true) {
            System.out.println("Enter the book name to search or type 'exit' to quit:");
            String bookName = scanner.nextLine();
            if (bookName.equalsIgnoreCase("exit")) {
                break;
            }
            library.searchBook(bookName);
        }      
        scanner.close();
    }
}