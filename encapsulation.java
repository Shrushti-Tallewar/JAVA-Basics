package project;

class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {

        if (id != null && !id.trim().isEmpty() && id.startsWith("EMP-")) {
            this.id = id;
        } else {
            System.out.println("Invalid ID! Defaulting to EMP-0000");
            this.id = "EMP-0000";
        }

        setName(name);

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Defaulting to 0.0");
            this.salary = 0.0;
        }
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name! Defaulting to Unknown");
            this.name = "Unknown";
        }
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Salary unchanged");
        }
    }
}
public class encapsulation {
	public static void main (String[]args) {
		

		        Employee e = new Employee("EMP-101", "Shrushti", 50000);

		     
		        System.out.println(e.getName());
		        System.out.println(e.getSalary());

		        e.setName("Riya");
		        e.setSalary(60000);
		        
		        System.out.println(e.getId());
		        System.out.println(e.getName());
		        System.out.println(e.getSalary());
		    }
		}
