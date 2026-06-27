package first;

public class Task2 {
	public void square(int n) {
		System.out.println(n*n);
	}
    Task2(String name , int age){
    	System.out.println(name);
    	System.out.println(age);
    }
    public void checkevenodd(int n) {
    	if (n% 2==0){
    		System.out.println("even");
    		}
    	else {
    		System.out.println("odd");
    	}
    }
    public  void findlargest(int c ,int d) {
        if ( c> d) {
        	System.out.println(c+"is greater");
        }
        else {
        	System.out.println(d+" is greater ");
        }
    }
public static void main(String[]args) {
	Task2 obj = new Task2("shyam",21);
	obj.square(5);
	obj.checkevenodd(3);
	obj.findlargest(20, 21);
	}

}
