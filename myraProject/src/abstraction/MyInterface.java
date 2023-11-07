package abstraction;

 interface MyInterface {    // interface
	 public static final int x = 25;
	 
	 // abstract method
	 public abstract void m1();
 }
 
 class InterfaceDemo implements MyInterface {
	 
	 // overriding
	 public void m1() {
		 System.out.println("Welcome");
		 
	 }
	  public static void main(String[] args) {
		  InterfaceDemo id = new InterfaceDemo();
		  id.m1();
		  System.out.println(x);
	  }

}
