package first;

class Vehicle{
	String brand;
	Vehicle(String brand){
		this.brand = brand;
	}}
class car extends Vehicle{ String model;
car(String brand, String model){
	super(brand);
	this.model = model;
}

	void display() {
		System.out.println("brand"+brand);
		System.out.println("model"+model);
	}
	}
 

public class Inheritance1 {
	public static void main (String[]args) {
	car c = new car("BMW","231");
	c.display();}}
	
 
