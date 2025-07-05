package costructorAssignment1;

public class BankAccount {
	
//	Assignment 5:
//
//		Create a Java class named "BankAccount" with the following instance variables:
//		accountNumber (String)
//		balance (double)
//
//		Create a constructor for the BankAccount class that takes in the accountNumber 
//			and balance as parameters and initializes the instance variables.
//		Create a method in the BankAccount class named "deposit" that takes in a double value 
//			as a parameter and adds it to the balance instance variable.
//		Create a method in the BankAccount class named "withdraw" that takes in a double value 
//			as a parameter and subtracts it from the balance instance variable.
//		Create a main method that creates an instance of the BankAccount class using the constructor 
//			and performs multiple deposits and withdrawals using the deposit and withdraw methods. 
//		Print out the updated balance after each transaction.
//
//		Questions & Answers:
//		What is the purpose of an instance variable in Java?
//			instance variables are class variables it can be used with in the class 
//		How are instance variables different from local variables in Java?
//			scope of the local variables are with in the method where the scope of the instance/ class variables are with the class. 
//		What is the access level of an instance variable in Java?
//			instance variables can be accessed with the same class since the best practice to create the instance variables are private
//		What is the purpose of a method in Java?
//			Methods in java is to specify the business logic based on the need/ requirement of the business.
//		Can a method call other methods within the same class?
//			yes can a method call other methods within the same class without creating the object of the class. 


	String accountNumber; 
	double balance; 	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double addMoney) {
		System.out.println("BeforeDeposit: Account Balance: "+getBalance());
		System.out.println("Deposit Amount:=====:"+addMoney);
		setBalance(getBalance()+addMoney);
		System.out.println("AfterDeposit: Account Balance: "+getBalance());
	}
	
	public void withdraw(double withdrawMoney) {
		System.out.println("Before Withdraw: Account Balance: "+getBalance());
		System.out.println("Withdraw Amount:=====:"+withdrawMoney);
		setBalance(getBalance()-withdrawMoney);
		System.out.println("After Withdraw: Balance: "+getBalance());
	}

	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount("12986", 5000.00);
		ba1.withdraw(200.00);
		ba1.deposit(100);

	}

}
