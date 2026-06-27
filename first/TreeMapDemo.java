package first;


import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[]args) {
		TreeMap<Integer,String>students = new TreeMap<Integer,String>();
		students.put(101,"Rahul");
		students.put(108,"vishal");
		students.put(103,"sam");
		students.put(102,"Rahul");
		
		System.out.println(students);
		
	}
}
