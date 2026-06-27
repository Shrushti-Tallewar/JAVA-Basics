package first;

//multilevel inheritance
class grandfather{
	public void plot() {
		System.out.println("5CR");}
	}
	
class father extends grandfather{
		public void car() {
			System.out.println("BMW");}
		
}
public class Son extends father{
	public static void main(String[]args) {
		Son Rahul = new Son();
		Rahul.plot();
		Rahul.car();
		
	}
}



