package abstraction;

//Base class
class Item {
 protected String title;
 protected String author;
 protected int year;
 protected boolean available;

 public Item(String title, String author, int year, boolean available) {
     this.title = title;
     this.author = author;
     this.year = year;
     this.available = available;
 }
}

//Book subclass
class Book extends Item {
 String genre;

 public Book(String title, String author, int year, String genre, boolean available) {
     super(title, author, year, available);
     this.genre = genre;
 }
}

//DVD subclass
class DVD extends Item {
 int duration; // Duration in minutes

 public DVD(String title, String author, int year, int duration, boolean available) {
     super(title, author, year, available);
     this.duration = duration;
 }
}

//Main class for testing
public class Lavanya {
 public static void main(String[] args) {
     // Example usage
	 Book bookExample = new Book("The Catcher in the Rye", "j.d lavanya", 1951, "Fiction", true);
     DVD dvdExample = new DVD("Inception", "sowjany", 2010, 148, true);
     
     System.out.println("Book Example:");
     System.out.println("Title: " + bookExample.title);
     System.out.println("Author: " + bookExample.author);
     System.out.println("Year: " + bookExample.year);
     System.out.println("Genre: " + bookExample.genre);
     System.out.println("Available: " + bookExample.available);

     System.out.println("\nDVD Example:");
     System.out.println("Title: " + dvdExample.title);
     System.out.println("Author: " + dvdExample.author); // Assuming director for DVDs
     System.out.println("Year: " + dvdExample.year);
     System.out.println("Duration: " + dvdExample.duration + " minutes");
     System.out.println("Available: " + dvdExample.available);
 }
}


















