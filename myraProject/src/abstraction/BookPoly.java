package abstraction;


//Base class with abstraction
abstract class Value{
 protected String title;
 protected String author;
 protected int year;
 protected boolean available;

 public Value(String title, String author, int year, boolean available) {
     this.title = title;
     this.author = author;
     this.year = year;
     this.available = available;
 }

 // Abstract methods
 abstract void checkOut();
 abstract void returnItem();
 abstract void displayDetails();
}

//Book subclass
class Given extends Value{
 private String genre;

 public Given(String title, String author, int year, String genre, boolean available) {
     super(title, author, year, available);
     this.genre = genre;
 }

 // Implementing abstract methods
 @Override
 void checkOut() {
     System.out.println("Given checked out. Please return within 14 days.");
 }

 @Override
 void returnItem() {
     System.out.println("Given returned successfully.");
 }

 @Override
 void displayDetails() {
     System.out.println("Given Details:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Year: " + year);
     System.out.println("Genre: " + genre);
     System.out.println("Available: " + available);
 }
}

//Return subclass
class Return extends Value{
 private int duration; // Duration in minutes

 public Return(String title, String director, int year, int duration, boolean available) {
     super(title, director, year, available);
     this.duration = duration;
 }

 // Implementing abstract methods
 @Override
 void checkOut() {
     System.out.println("Return checked out. Please return within 7 days.");
 }

 @Override
 void returnItem() {
     System.out.println("Return returned successfully.");
 }

 @Override
 void displayDetails() {
     System.out.println("Return Details:");
     System.out.println("Title: " + title);
     System.out.println("Director: " + author); 
     System.out.println("Year: " + year);
     System.out.println("Duration: " + duration + " minutes");
     System.out.println("Available: " + available);
 }
}

//Main class for testing
public class BookPoly {

 public static void main(String[] args) {
     // Example usage
     Given givenExample = new Given("The Catcher in the Rye", "J.D. lavanya", 1951, "Fiction", true);
     Return returnExample = new Return("Inception", "sowjanya", 2010, 148, true);

     
     givenExample.checkOut();
     returnExample.checkOut();

     // Display details using abstract method
     givenExample.displayDetails();
     returnExample.displayDetails();
 }
}





























