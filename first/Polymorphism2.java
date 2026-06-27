package first;
                                // run time polymorphism
class Women{                   // method overriding
	public void work() {
		System.out.println("Teacher is teaching");
	}
}
class Teacher extends Women{
	public void Work() {
		System.out.println("Working is working");
	}
}

public class Polymorphism2 {
	public static void main (String []args) {
		Women w= new Women();
		w.work();
	}

}
