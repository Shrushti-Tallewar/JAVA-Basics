package first;

//Hierarchical inheritance
 class Parent{
	 public void house() {
		 System.out.println("2bhk");
		 
	 }
 }
 class Sister extends Parent{
	 
 }
public class Brother extends Parent {
	public static void main(String[]args) {
		Brother obj = new Brother();
		Sister obj2 = new Sister();
		obj.house();
		obj2.house();
	}

}
