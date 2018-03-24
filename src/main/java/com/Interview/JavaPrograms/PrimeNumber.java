package com.Interview.JavaPrograms;
//prime no between 1 to 100
public class PrimeNumber {

	//https://www.youtube.com/watch?v=paJAz0wm_Yw
	public static void main(String[] args) 
	{
		int n=100;
		for(int i=1;i<=n;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
			System.out.println(i+ "  ");
			}
		}
	}

}
