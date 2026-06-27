package first;

class Employee2{
	private int employeeid;
	private String employeename;
	private int salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class Encapsulation1 {
	 public static void main(String[]args){
     Employee2 e1 = new Employee2();
    e1.setEmployeeid(1);
    e1.setEmployeename("shrushti");
    e1.setSalary(40000);
  
   System.out.println(e1.getEmployeeid());
   System.out.println(e1.getEmployeename());
   System.out.println(e1.getSalary());
}
}
