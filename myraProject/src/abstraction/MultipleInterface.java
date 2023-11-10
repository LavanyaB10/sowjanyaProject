package abstraction;
interface value1{
	int number1=200;
	
	void print();
	}
interface value2 {
	int number2=300;
	void print();
}
class Child implements value1, value2{

public void print() {
System.out.println(number1+" "+number2);
}
}

 public class MultipleInterface {
	 
	public static void main(String[]args) {
    Child c = new Child();
    c.print();
}
	}
