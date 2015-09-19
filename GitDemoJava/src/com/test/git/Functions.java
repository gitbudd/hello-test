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

}
