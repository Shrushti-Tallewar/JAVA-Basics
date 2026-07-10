package first;

abstract class ATM{
	
		abstract void withdraw();	
         void show() {
	System.out.println("HELLO");
	}
}  
class HDFC extends ATM{
	void withdraw() {
		System.out.println("money withdraw successfully");
	}
}
public class Abstraction {
	public static void main (String[]args) {
		ATM a = new HDFC();
		a.withdraw();
		a.show();
	}

}
