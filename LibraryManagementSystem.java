import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        library.addBook(new Book("1984", "George Orwell", 3));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Check out a book");
            System.out.println("2. Search for a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the ID of the book to check out: ");
                    int id = scanner.nextInt();
                    library.checkOutBook(id);
                    break;
                case 2:
                    System.out.print("Enter the title of the book to search: ");
                    String title = scanner.nextLine();
                    library.searchBook(title);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
