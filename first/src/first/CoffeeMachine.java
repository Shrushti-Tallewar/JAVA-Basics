package first;

class BoilWater extends Thread{
       public void run() {
    	   System.out.println("boiling water");
    	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
       }
 }
 class HeatMilk extends Thread{
	 public void run() {
		 System.out.println("Heating Milk");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
 class GrindCoffee extends Thread{
	 public void run() {
		 System.out.println("Grinidng coffee");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
public class CoffeeMachine {
	public static void main (String[]args) {
		BoilWater t1 = new BoilWater();
		HeatMilk m2 = new HeatMilk();
		GrindCoffee g1 = new GrindCoffee();
		
		t1.start();
		m2.start();
		g1.start();
		
	}

}
