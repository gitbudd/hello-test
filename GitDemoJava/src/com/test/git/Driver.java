package com.test.git;

public class Driver {

	public static void main(String[] args) {
		
		Functions func=new Functions();
		display();
		func.function1();
	}
	
	public static void display(){
		System.out.println("THIS IS LINE 1 IN DRIVER");
		System.out.println("THIS IS LINE 2 IN DRIVER");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}
