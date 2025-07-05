package staticMethod;

public class TestingStaticOverload {

	// Static methods can be overloaded but cannot be overridden 
	public static void sendMail() {
		System.out.println("send mail - static method");
	}
	
	public static void sendMail(String subject) { // 1 param
		System.out.println("send mail - static method"+ subject);
	}
	
	public static void sendMail(String subject, String to) { // 2 param
		System.out.println("send mail - static method"+ subject+" - "+to);
	}
	
	public static void sendMail(String subject, String to, String cc) { // 3 param
		System.out.println("send mail - static method :  "+ subject+" - "+to+" - "+cc);
	}
	
	public static void main(String[] args) {
		
		TestingStaticOverload.sendMail("Training Java", "testing@gmail.com", "senth@gmail.com");
	}

}
