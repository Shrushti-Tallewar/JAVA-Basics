package first;
                                             // compile time polymorphism
class Calculator{                           //over loading 
	public void add(int a ,int b) {
		System.out.println(a+b);
}
	
		public void add(int a ,int b,int c) {
			System.out.println(a+b+c);
	}
public class Polymorphism {
    public static void main (String[]args) {
    	Calculator c = new  Calculator();
    	c.add(10, 10);
    	c.add(10,10,10);
    }
}
}
