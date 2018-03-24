package com.Interview.JavaPrograms.practicecode;

public class C extends B {
	int e;
	int f;
	C()
	{
		System.out.println("C's default constructor..");
	}
	
	C(int e,int f)
	{
		super(e,f);
		System.out.println("C's 2 Arg constructor..");
		this.e=e;
		this.f=f;
		
	}
	C(int a,int b,int c,int d, int e,int f)
	{
		super(a,b,c,d);
		System.out.println("B's 6 Arg constructor..");
		this.e=e;
		this.f=f;
				
	}
	void show()
	{
		System.out.println("A's Show");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}
