import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkOutBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found or already checked out.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ID: " + book.getId());
                System.out.println("Available: " + book.isAvailable());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
