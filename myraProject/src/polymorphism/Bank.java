package polymorphism;

public class Bank  
{

public int account(int x, int y) {
	return x+y;	
}
	
 public int account(int x,int y, int z) {
	 return x+y+z; 
	}
 
 public double account(double x, double y) {
	 return x+y;
 }
 public static void main(String[] args) {
	 
	 Bank bk = new Bank();
	 bk.account(10, 100);
	 bk.account(20, 200, 3000);
	 bk.account(1000, 2000);
	 
 }

}

