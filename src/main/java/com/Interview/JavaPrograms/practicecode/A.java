package com.Interview.JavaPrograms.practicecode;
// Inheritace with constructor program
public class A {
	int a;
	int b;
	A()
	{
		System.out.println("A's default constructor..");
	}
	A(int a,int b)
	{
		System.out.println("A's 2 arg constructor");
		this.a=a;
		this.b=b;
	}
	

}
