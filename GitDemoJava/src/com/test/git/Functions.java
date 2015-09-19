package com.test.git;

public class Functions {
	int data[]={0,4,2,9};
	public void function1(){
		String name="RJ";
		System.out.println("MY NAME IS "+name+" "+getClass().getName());
		System.out.println("********************New Implementation*********************");
		for (int i = 0; i < data.length; i++) {
			System.out.println("Data from array: "+data[i]);
			
		}
	}
	
	public void test1(){
		System.out.println("Branch 1: Test1");
	}
	
	public void test2(){
		System.out.println("test2");
	}
	

	public void test4(){
		System.out.println("Test4");
		System.out.println("New line in method 4 for conflict");
	}

	public void test3(){
		System.out.println("Test3");
		System.out.println("Added new line in method 3 for conflict test");
	}
	
	
	

}
