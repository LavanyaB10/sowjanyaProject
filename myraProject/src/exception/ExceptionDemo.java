package exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Well come to my home");
	try {
		int a =10;
		int b =20;
		int c =a/b;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Hello all of you");
		System.out.println("my name is lavanya");
				
}
	
}