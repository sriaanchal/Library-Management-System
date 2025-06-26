import java.util.*;

class Book {
    int id;
    String title;
    boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public void issue() {
        isIssued = true;
    }

    public void returned() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return id + ". " + title + " (Issued: " + (isIssued ? "Yes" : "No") + ")";
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    HashMap<Integer, Integer> issuedBooks = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (!b.isIssued) {
                    b.issue();
                    issuedBooks.put(bookId, userId);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId, int userId) {
        if (issuedBooks.containsKey(bookId) && issuedBooks.get(bookId) == userId) {
            for (Book b : books) {
                if (b.id == bookId) {
                    b.returned();
                    issuedBooks.remove(bookId);
                    System.out.println("Book returned successfully.");
                    return;
                }
            }
        } else {
            System.out.println("Invalid return request.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        ArrayList<User> users = new ArrayList<>();

        lib.addBook(new Book(1, "Java Programming"));
        lib.addBook(new Book(2, "Python Basics"));
        lib.addBook(new Book(3, "Data Structures"));

        users.add(new User(101, "Ansh"));
        users.add(new User(102, "Aanchal"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    lib.issueBook(bookId, userId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int returnUserId = sc.nextInt();
                    lib.returnBook(returnBookId, returnUserId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.out.println("Task 3: Library Management System by Aanchal Srivastav");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
