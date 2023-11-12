package abstraction;
import java.util.ArrayList;
import java.util.Scanner;

// Item class (base class)
abstract class Item {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    // Abstract methods
    public abstract void checkOut();

    public abstract void returnItem();

    public abstract void displayDetails();

    // Getter methods for attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter method for availability
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// Book class (subclass of Item)
class Book extends Item {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void checkOut() {
        if (isAvailable()) {
            System.out.println("Checking out the book: " + getTitle());
            setAvailable(false);
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the book: " + getTitle());
        setAvailable(true);
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Book Year: " + getYear());
        System.out.println("Book Genre: " + genre);
        System.out.println("Book Available: " + isAvailable());
    }
}

// DVD class (subclass of Item)
class DVD extends Item {
    private String director;

    public DVD(String title, String author, int year, String director) {
        super(title, author, year);
        this.director = director;
    }

    @Override
    public void checkOut() {
        if (isAvailable()) {
            System.out.println("Checking out the DVD: " + getTitle());
            setAvailable(false);
        } else {
            System.out.println("DVD is already checked out.");
        }
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the DVD: " + getTitle());
        setAvailable(true);
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("DVD Author: " + getAuthor());
        System.out.println("DVD Year: " + getYear());
        System.out.println("DVD Director: " + director);
        System.out.println("DVD Available: " + isAvailable());
    }
}

// Library class to manage items
class Library {
    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailable Items in the Library:");
        for (Item item : items) {
            if (item.isAvailable()) {
                item.displayDetails();
                System.out.println();
            }
        }
    }

    public Item searchItem(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding sample items to the library
        library.addItem(new Book("The Catcher in the Rye", " Mockingbird", 1960, "Fiction"));
        library.addItem(new DVD("Inception", "lavanya", 2010, "lavanya"));

        int choice;
        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Display Available Items");
            System.out.println("2. Check Out Item");
            System.out.println("3. Return Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAvailableItems();
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the title of the item to check out: ");
                    String checkoutTitle = scanner.nextLine();
                    Item checkoutItem = library.searchItem(checkoutTitle);
                    if (checkoutItem != null) {
                        checkoutItem.checkOut();
                    } else {
                        System.out.println("Item not found in the library.");
                    }
                    break;
                case 3:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the title of the item to return: ");
                    String returnTitle = scanner.nextLine();
                    Item returnItem = library.searchItem(returnTitle);
                    if (returnItem != null) {
                        returnItem.returnItem();
                    } else {
                        System.out.println("Item not found in the library.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}


