package first;
class Fuelloading extends Thread{
	public void run() {
		try {
			System.out.println("Fuel Loading Started...");
			Thread.sleep(3000);
			System.out.println("Fuel Loading Started...");
			}
		catch (InterruptedException e ) {
			System.out.println(e);
		}
	}
}
 class WeatherCheck extends Thread {
	 public void run() {
		 try {
				System.out.println("Checking Weather...");
				Thread.sleep(2000);
				System.out.println("Weather is clear");
				}
			catch (InterruptedException e ) {
				System.out.println(e);
			}
	 }
 }
 
 class NavigationSystem extends Thread{
	 public  void run() {
		 try {
				System.out.println("Starting Navigation System...");
				Thread.sleep(2000);
				System.out.println("Navigation Ready");
				}
			catch (InterruptedException e ) {
				System.out.println(e);
			}
 }}

public class Rocket {
 public static void mian(String[]args) {
		 
		 Fuelloading t1 = new Fuelloading();
		 WeatherCheck t2 = new WeatherCheck();
		 NavigationSystem t3 = new NavigationSystem();
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 
		 try {
			 t1.join();
			 t2.join();
			 t3.join();
			 }
		 catch (InterruptedException e) {
			 System.out.println(e);
			 
		 }  
		 
		 System.out.println("\n All Systems Ready!");
		 System.out.println("Launching in..");
		  
		 
		 try {
			 Thread.sleep(1000);
			 System.out.println("3");
			 Thread.sleep(1000);
			 System.out.println("2");
			 Thread.sleep(1000);
			 System.out.println("1");
			 Thread.sleep(1000);
			 System.out.println("Rocket Launched Successfully");
		 }
		 catch(InterruptedException e) {
			 System.out.println(e);
		 }
 }
}
