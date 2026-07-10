package first;

public class String_immutable {
    public static void main (String[]args) {
    	String name = "Java";
    	name.concat("programming");
    	System.out.println(name);
    	
    	String text="";
    	
    	for (int i = 1; i<=5; i++) {
    		text = text + i;
    	}
    	System.out.println(text);
    }
}
