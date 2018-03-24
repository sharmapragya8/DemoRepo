package com.Interview.JavaPrograms.practicecode;

public class B extends A {
	int c;
	int d;
	B()
	{
		System.out.println("B's default constructor..");
	}
	B(int c,int d)
	{
		super(c,d);
		System.out.println("B's 2 arg constructor");
		
		this.c=c;
		this.d=d;
	}
	B(int a,int b,int c,int d)
	{
		super(a,b);
		System.out.println("B's 4 arg constructor");
		this.c=c;
		this.d=d;
	}
	
}
