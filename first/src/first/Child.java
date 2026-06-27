package first;


class Dad{                            //Single Inheritance
	public void House() {
		System.out.println("1CR");
	}
	public void car() {
		System.out.println("BMW");
	}
}
public class Child extends Dad{
	public static void main (String[] args) {
		Child Akshay = new Child();
		Akshay.House();
		Akshay.car();
	}

}
