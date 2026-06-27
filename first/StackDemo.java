package first;

import java.util.Stack;

public class StackDemo {
public static void main (String[]args) {
	Stack<String>books = new Stack<String>();
	books.push("Java");
	books.push("C++");
	System.out.println("Books in Stack:"+ books);
	
	// Top book
	
	System.out.println("Top Book:"+ books.peek());
	
	//Remove books
	System.out.println("Removed Book:"+ books.pop());
	
	// Remaining books
	System.out.println("Remainaing Book:"+ books);
}
}
