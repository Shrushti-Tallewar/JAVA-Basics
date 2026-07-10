package first;


abstract class payment{
	abstract void pay();
}

class WashingMachine extends payment{
	void pay() {
		System.out.println("cost is 10000");
	}
}
public class Abstarction1 {
	public static void main (String []args) {
	
    payment p = new WashingMachine();
    p.pay();
	}}

