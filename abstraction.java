package project;

abstract class Payment{
		    abstract void pay(double amount);

		    void displayPaymentMethod() {
		        System.out.println("Payment done by");
		    }
		    }
		
		class CreditCard extends Payment {
		    void pay(double amount) {
		        System.out.println(" ₹" + amount + " using Credit Card");
		    }
		}
		class UPI extends Payment {
		    void pay(double amount) {
		        System.out.println(" ₹" + amount + " using UPI");
		    }
		}
		class Cash extends Payment {
		    void pay(double amount) {
		        System.out.println(" ₹" + amount + " using Cash");
	}
}

public class abstraction {
	public static void main (String []args) {
		Payment p1 = new CreditCard();
		p1.displayPaymentMethod();
        p1.pay(1000);
        System.out.println();
        Payment p2 = new UPI();
        p2.pay(500);
        System.out.println();
        Payment p3 = new Cash();
        p3.pay(250);
    }
}
