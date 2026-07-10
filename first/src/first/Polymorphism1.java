package first;
 class employee3{
	 public void work() {
		 System.out.println("Employee is working");
	 }
 }
 
 class student3 extends employee3{
	 public void work() {
		 super.work();
		 System.out.println("Student is working");
	 }
 }

public class Polymorphism1 {
	public static void main (String []args) {
	student3 emp = new student3();
	emp.work();
		
	}

}
