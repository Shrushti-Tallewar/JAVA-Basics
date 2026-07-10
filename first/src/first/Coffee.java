package first;

public class Coffee {
	public static void main (String[]args) throws InterruptedException{
		
		System.out.println("Boiling Water...");
		Thread.sleep(3000);
		
		System.out.println("Heating Milk...");
		Thread.sleep(3000);
		
		System.out.println("Grinding Coffee...");
		Thread.sleep(3000);
		
		System.out.println("Coffee is ready!");
	}

}
