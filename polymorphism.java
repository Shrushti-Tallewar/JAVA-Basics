package project;

class notification{
	void send() {
		System.out.println("hello");
	}
}

class emailnotification extends notification{
	void send() {
		System.out.println("hello world");
		super.send();
	}
}

class smsnotification extends emailnotification{
	void send () {
		System.out.println("hello world sms");
	
	super.send();
}}
public class polymorphism {
	public static void main (String[]args) {
		smsnotification s = new smsnotification();
		s.send();
	}
	
}


