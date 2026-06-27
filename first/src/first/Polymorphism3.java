package first;
class AreaCalculator{
	public void area(int side) {
		System.out.println(side*side);
	}
	public void area(int length, int breadth) {
		System.out.println( length * breadth);
	}
}

public class Polymorphism3 {
	public static void main (String []args) {
		AreaCalculator ac = new AreaCalculator();
		ac.area(3);
		ac.area(3,6);
	}
}
