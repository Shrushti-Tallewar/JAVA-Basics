package first;

import java.util.LinkedHashSet;
public class LinkedHashDemo {
	

	
		public static void main (String[]args) {
			LinkedHashSet<String>students = new LinkedHashSet<String>();
			students.add("Rahul");
			students.add("Shyam");
			students.add("Amit");
			students.add("Rahul");
			System.out.println(students);
		}
	}
