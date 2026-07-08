package project;

class employee{
	String name;
	int id;
	int salary;
	
	employee(String name,int id,int salary){
	this.name = name ;
	this.id = id;
	this.salary= salary;
	}
	
	void displaydetails() {
		System.out.println("name:"+name);	
		System.out.println("age:"+id);
		System.out.println("salary:"+ salary);
		}
}

class manager extends employee{
	String department;
	
	manager(String name,int id,int salary,String department){
		super(name,id,salary);
	
	this.department = department;}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("department:"+department);
	}
}
	
	public class inheritance {
	    public static void main(String[] args) {
	    	manager mg = new manager("shrushti",102 , 60000,"IT");
	    	mg.displaydetails();
	    
	    	}
	    }
	        
	
