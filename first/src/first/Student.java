package first;

public class Student {
	Student(){
		System.out.println("default");
	}
    Student(String name){
    	System.out.println("name:"+ name);
    }
    Student(String name,int age){
    	System.out.println("name:"+name);
    	System.out.println("age:"+age);
    }
    public static void main(String[]args) {
    	Student obj1 = new Student();
    	Student obj2 = new Student("shrushti");
    	Student obj3 = new Student("arsh",22);
    	}
}
