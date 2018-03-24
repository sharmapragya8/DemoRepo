package com.Interview.JavaPrograms;

public class RevEachWordCharacter {
	public static void main(String[] args) {
		RevEachWordCharacter rv=new RevEachWordCharacter();
		rv.revString("My name is Pragya");
	
	}
	
	public static void revString(String str)
	{
		
		
		String a[]=str.split(" ");
		
		
				for(int i=0;i<a.length;i++)
				{
					String rev="";
					String temp="";
					char c[]=str.toCharArray();
					for(int j=0;j<=c.length;j++)
					{
						temp=temp+j;
					}
					
					System.out.println(temp);
				}
		}	

}
