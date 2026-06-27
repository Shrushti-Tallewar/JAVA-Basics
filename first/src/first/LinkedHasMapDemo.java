package first;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHasMapDemo {
	public static void main(String[]args) {
		LinkedHashMap<Integer,String>students = new LinkedHashMap<Integer,String>();
		students.put(101,"Rahul");
		students.put(108,"vishal");
		students.put(103,"sam");
		students.put(102,"Rahul");
		
		System.out.println(students);
		

	}
		}


