package com.Interview.JavaPrograms;

public class ABC_Test {

	public static void main(String[] args) {
		System.out.println("Calling default constructor of c");
		C obj=new C();
		obj.show();
		System.out.println(" Calling C's 1 Arg constructor..");
		C obj1=new C(555);
		obj1.show();
	}

}
