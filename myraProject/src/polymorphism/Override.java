package polymorphism;
class OverridingDemo{
	void main() {
		System.out.println("This is a parent method");
	}
}
class Demo extends OverridingDemo{
	void main() {
		System.out.println("This is a child method");
	}
}

public class Override {
 public static void main(String[] args) {
	 Demo d = new Demo();
	 d.main();
	 
 }
}
