package functionsConcept;

import java.nio.file.spi.FileSystemProvider;

public class User {
	
	
	public int getUserbillAmount(String userName) {
		System.out.println("getting Bill Amount for: "+userName);
		int amount=-1;
		
		if(userName.equals("tom")) {
//			return 1000;
			amount = 1000;
		}else if(userName.equals("Srinish")) {
//			return 1500;
			amount = 1500;
		}else if(userName.equals("Senthil")) {
//			return 3000;
			amount=3000;
		}else {
			System.out.println("user not found...  "+ userName);
//			return -1;
		}
		return amount;
	}

	public static void main(String[] args) {
		User u1=new User();
		
		int num=u1.getUserbillAmount("Senthi");
		System.out.println(num);
		
		if(num<0) {
			System.out.println("No Need to generate invoice .. ");
		}else {
			System.out.println("send the invoice.... ");
		}
	}

}
