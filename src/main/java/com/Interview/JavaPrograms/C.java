package com.Interview.JavaPrograms;

public class C extends B 
{
	int c;
	int x=300;
	{
		System.out.println("C's Instance Block......");
	}
	static
	{
		System.out.println("C's Static Block......");
	}
	C()
	{
		System.out.println("C's Default Constructor......");
	}
	C(int c)
	{
		super(c);  //it should call a's 1 arg then B's one arg then c's 1 arg
		System.out.println("C's 1 Arg Constructor......");
	}
	void show()
	{
		System.out.println("C's Show Method......");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println("this.x-- "+this.x);
		System.out.println("super.x-- "+super.x);
		m1();
		this.m1();
		super.m1();
	}
}
