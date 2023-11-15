package exception;

public class TwoCatch {
	public static void main(String[]args) {
		try {
		int arr[] = {2 ,5};
		arr [3] = 3/0;
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe.getMessage());
		}
		
		finally {
			System.out.println("Welcome to my office");
			
		}
		System.out.println("End of the program");
	}

}
