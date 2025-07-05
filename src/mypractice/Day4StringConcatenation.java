package mypractice;

public class Day4StringConcatenation {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		byte byteB = 50;
		
		String x="Hello";
		String y="Java";
		
		System.out.println(a+b); // 300 - when both are integers when using arithmetic operators then addition will be performed by the compiler
		System.out.println(a+x); // 100hello - one is string so string will be 
		System.out.println(a+byteB); // 150
		System.out.println(x+byteB); // Hello50
		System.out.println(x+y); // HelloJava
		System.out.println(a+b+x+y); // 300HelloJava
		System.out.println(x+y+a+b); // HelloJava100200
		System.out.println(x+y+(a+b)); // HelloJava300
		System.out.println(byteB+a+b+x+y); // 350HelloJava
		System.out.println(a+x+b+y); // 100Hello200Java
		
		// Double 
		double c = 12.33;
		double d = 22.33;
		System.out.println(c+d+x+y); // 34.66HelloJava
		System.out.println(a+b+c+d+x+y); // 334.66HelloJava
		System.out.println(c+d+x+y+a+b); // 34.66HelloJava100200
		System.out.println(c+d+x+y+(a+b)); // // 34.66HelloJava300
		
		float f1=10.2f;
		float f2=20.33f;
		System.out.println(x+y+f1+f2); //HelloJava10.220.33
		System.out.println(x+y+(f1+f2)); // HelloJava30.529999
		
		
		char ch='a';
		System.out.println(x+ch); // Helloa
		
		boolean flag=true;
		System.out.println(flag+x+y); // trueHelloJava
		
		int total = 2000;
		int fee = 250;
		System.out.println("Your total bill is: "+total);
		System.out.println("Your total fee is: "+fee);
		System.out.println("Your Final amount : "+ total+fee); //2000250 // concatination only happen
		System.out.println("Your Final amount : "+ (total+fee)); //Your Final amount : 2000250
		System.out.println("Your Final amount : "+ (total-fee)); // Your Final amount : 1750
		
		String s="world";
		String mobile="989876765647";
		
		System.out.println(10+20+40+"hello"+"world"); // 70helloworld
		System.out.println("hello"+"world"+10+20+40); // helloworld102040
		
		System.out.println(12.23+23.44+"hello"+"world"+(10+20+40)); // 35.67helloworld70
		
		
		
		
		
		
		
	}

}
