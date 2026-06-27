package first;

public class methodsDemo {
    public void siri() {                                //default method
    	System.out.println("hey how are you?");
    } 
    public void add(int a, int b) {                     //method using parameters a and b
    	System.out.println(a+b);
    }
    static int square(int n) {                          //method with written type
    	return n*n;
    }
    static void checkEvenOdd(int n) {                   //basic program even and odd with methods
    	if(n%2 == 0) {
    		System.out.println("even");}
    		else {
    			System.out.println("odd");
    		}
    	}
        public static void main(String[]args) {
    	methodsDemo obj = new methodsDemo();
    	obj.siri();
    	obj.add(12, 13) ;                              //argument
    	System.out.println(square(6));                 //return
    	checkEvenOdd(8);
    	}
}

