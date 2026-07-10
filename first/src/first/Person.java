package first;


class Student2{String name;
Student2(String name){
	this.name = name;
}
	
}
class Student3 extends Student2{ 
	String course;
Student3(String name, String course ){
	super (name);
	this.course= course;
}
void display() {
	System.out.println("name:"+name);
	System.out.println("course:"+course);
}

}
public class Person{
	public static void main (String[]args) {
		Student3 st = new Student3("ram","java");
		st.display();
		
	}
}
 

