package com.Interview.JavaPrograms;

public class A {
	int a;
	String s;
	int x=100;
	{
		System.out.println("A's Instance Block..");
	}
	static
	{
		System.out.println("A's Static block..");
	}
	A()
	{
		System.out.println("A's Default Constructor");
	}
	A(int a)
	{
		System.out.println("A's 1- Arg constructor");
		this.a=a;
	}

}
