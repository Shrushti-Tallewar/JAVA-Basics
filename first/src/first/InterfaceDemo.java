package first;

interface Atm1{
	 void withdraw();
}
 class axis {
	 void withdraw() {
		 System.out.println("money withdraw sucessfully");
	 }
 }
public class InterfaceDemo {
	public static void main (String []args) {
		axis a = new axis();
		a.withdraw(); 
	}
}
