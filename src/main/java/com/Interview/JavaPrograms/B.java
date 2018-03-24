package com.Interview.JavaPrograms;

public class B extends A {

	int b;
	int x=200;
	{
		System.out.println(" B's Instance block....");
	}
	static {
		System.out.println(" B's Static block....");
	}
	B()
	{
		System.out.println(" B's Default Constructor....");
	}
	B(int b)
	{
		super(b);
		System.out.println(" B's 1 Arg Constructor....");
		this.b=b;
	}
	void m1()
	{
		System.out.println(" B's Method m1()....");
		System.out.println(x);// x is local-- will give 200
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
