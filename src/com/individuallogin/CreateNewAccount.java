package com.individuallogin;

public class CreateNewAccount {  //class
	
	//Method 1
	private void emailId() {
		
		System.out.println("greensavadi@gmail.com");
	}
	//Method 2
	private void password() {
		
		System.out.println("1234567890");
	}
	//Method 3
	private void phoneNumber() {
	
		System.out.println("8493849384");
	}
	//Main Method
	public static void main(String[] args) {

		//Object Creation -- ClassName objectName = new ClassName();
		CreateNewAccount c = new CreateNewAccount();
		
		//Method call - objectName.methodName();
		c.emailId();
		c.password();
		c.phoneNumber();
		
		System.out.println("java selenium");
	}
}
