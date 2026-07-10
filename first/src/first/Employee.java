package first;

public class Employee {
	Employee(){
		System.out.println("default");
	}
	Employee(String name){
		System.out.println("name:"+name);
	}
	Employee(String name,int salary){
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	public static void main(String[]args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee("rohit");
		Employee obj3 = new Employee("piyush",40000);

	}
}
