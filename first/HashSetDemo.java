package first;

import java.util.HashSet;

public class HashSetDemo {
	public static void main (String[]args) {
		HashSet<String>students = new HashSet<String>();
		students.add("Rahul");
		students.add("Shyam");
		students.add("Amit");
		students.add("Rahul");
		System.out.println(students);
	}
}
