package first;

public class StringDemo {
	public static void main(String[]args) {
		String text = "Hello Java World";
		System.out.println("Original String :"+text);
		System.out.println("Length:"+ text.length());
		System.out.println("Uppercase:"+ text.toUpperCase());
		System.out.println("Lowercase:"+ text.toLowerCase());
		System.out.println("Character at index 4"+ text.charAt(4));
		System.out.println("Contains 'Java':"+text.contains("Java"));
		System.out.println("Starts with 'hello':"+text.startsWith("Hello"));
		System.out.println("Ends with 'World':"+text.endsWith("World"));
		System.out.println("Index of 'Java':"+text.lastIndexOf("o"));
		
		System.out.println("Replace:"+ text.replace("Java", "Python"));
	
		
		String spaces = "Java";
	    System.out.println("Trim:'"+ spaces.trim()+"'");
	     String fruits = "Apple,Mango,Banana";
	     String[]arr = fruits.split(",");
	     
	    System.out.println("Split Result:");
	    for (String fruit:arr) {
	    	System.out.println(fruit);
	    }
	    String joined = String.join("-","Java","Python","C++");
	      System.out.println("Join:"+ joined);
	    System.out.println("Repeat:"+"Hi".repeat(3));
}
}