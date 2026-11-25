import java.util.Scanner;
import java.util.ArrayList;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public void displayBook() {
        String status = isBorrowed ? "Borrowed" : "Available";
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + status);
    }
}

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showRole();
}

class User extends Person {
    private int userId;

    public User(int userId, String name) {
        super(name);
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public void showRole() {
        System.out.println("User ID: " + userId + " | Name: " + getName() + " (Library Member)");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added successfully!");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (Book b : books) {
            b.displayBook();
        }
    }

    public void borrowBook(int bookId, User user) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isBorrowed()) {
                    b.setBorrowed(true);
                    System.out.println("Success: " + user.getName() + " borrowed '" + b.getTitle() + "'.");
                } else {
                    System.out.println("Sorry, '" + b.getTitle() + "' is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ID " + bookId + " not found.");
    }

    public void returnBook(int bookId, User user) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isBorrowed()) {
                    b.setBorrowed(false);
                    System.out.println("Success: " + user.getName() + " returned '" + b.getTitle() + "'.");
                } else {
                    System.out.println("Error: This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ID " + bookId + " not found.");
    }
}

public class libraryManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Initial default books
        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(103, "Data Structures", "Mark Weiss"));

        System.out.print("Enter your user ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        User currentUser = new User(userId, userName);
        currentUser.showRole();

        int choice = 0;

        while (choice != 5) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    System.out.print("\nEnter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    library.borrowBook(borrowId, currentUser);
                    break;

                case 4:
                    System.out.print("\nEnter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId, currentUser);
                    break;

                case 5:
                    System.out.println("\nThank you for using the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid selection! Please enter a number between 1 and 5.");
                    break;
            }
        }

        sc.close();
    }
}
