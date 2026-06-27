package first;
class animal{
	animal(){
		System.out.println("animal craeted");
	}
}
class dog extends animal{
	dog(){
		System.out.println("dog created");
	}
}
public class Inheritance2 {
	public static void main (String[]args) {
		dog g = new dog();
		
	}

}
