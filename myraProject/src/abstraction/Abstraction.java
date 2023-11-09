package abstraction;

//Base class with abstraction
abstract class Type{
 protected String title;
 protected String author;
 protected int year;
 protected boolean available;

 public Type(String title, String author, int year, boolean available) {
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
class Method extends Type{
 public Method(String title, String author, int year, boolean available) {
		super(title, author, year, available);
		// TODO Auto-generated constructor stub
	}

private String genre;

 public Method(String title, String author, int year, String genre, boolean available) {
     super(title, author, year, available);
     this.genre = genre;
 }

 // Implementing abstract methods
 @Override
 void checkOut() {
     System.out.println("Method checked out successfully.");
 }

 @Override
 void returnItem() {
     System.out.println("Method returned successfully.");
 }

 @Override
 void displayDetails() {
     System.out.println("Method Details:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Year: " + year);
     System.out.println("Genre: " + genre);
     System.out.println("Available: " + available);
 }
}

//DVD subclass
class Check extends Type{
 private int duration; // Duration in minutes

 public Check(String title, String author, int year, int duration, boolean available) {
     super(title, author, year, available);
     this.duration = duration;
 }

 // Implementing abstract methods
 @Override
 void checkOut() {
     System.out.println("check checked out successfully.");
 }

 @Override
 void returnItem() {
     System.out.println("Check returned successfully.");
 }

 @Override
 void displayDetails() {
     System.out.println("DVD Details:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author); // Assuming director for DVDs
     System.out.println("Year: " + year);
     System.out.println("Duration: " + duration + " minutes");
     System.out.println("Available: " + available);
 }
}

//Main class for testing
public class Abstraction {
 public static void main(String[] args) {
     // Example usage
     Method methodExample = new Method("The Catcher in the Rye", "J.D. suresh", 1951, "Fiction", true);
     Check checkExample = new Check("Inception", "jayamma", 2010, 148, true);
    


     // Example of abstraction
     methodExample.checkOut();
     checkExample.returnItem();

     // Display details using abstract method
     methodExample.displayDetails();
     checkExample.displayDetails();
 }
}















