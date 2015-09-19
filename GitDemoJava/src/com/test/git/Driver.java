package com.test.git;

public class Driver {

	public static void main(String[] args) {
		
		Functions func=new Functions();
		display();
		func.function1();
	}
	
	public static void display(){
		System.out.println("This is line 1 in driver");
		System.out.println("This is line 2 in driver");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}
