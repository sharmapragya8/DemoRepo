package com.Interview.JavaPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		ReverseEachWord rv=new ReverseEachWord();
		rv.revString("My name is Pragya");
	}
	public static void revString(String str)
	{
		int i;	
		String a[]=str.split(" ");
				for(i=0;i<a.length;i++)
		{
			System.out.print( a[i]);
		}
		System.out.println();
		for(int j=a.length-1;j>=0;j--)
		{
				
			System.out.print(a[j]);
			
			
		}
		

	}

}
