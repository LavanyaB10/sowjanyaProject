package abstraction;

// abstract class
abstract class Animal{
	
	//abstract method
	abstract void sound();
	
	// concrete method
	void display () {
		System.out.println("Animal class");
	}
	
}

abstract class Dog extends Animal { // inheritance
	
// method overriding
	void sound() {
		System.out.println("Barking");
	}
	
}

public class Abstract {
	public static void main(String[] args) {
		Dog d = new Dog ();
		d.sound();
			
		
	}

}
