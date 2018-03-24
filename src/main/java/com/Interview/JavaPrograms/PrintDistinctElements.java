package com.Interview.JavaPrograms;

public class PrintDistinctElements {

	public static void main(String[] args) {
		int arr[]= {5,6,3,8,8,9,7,8};
		for(int i=0;i<arr.length;i++)
		{
			boolean isdistinct=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isdistinct=true;
					break;
				}
				System.out.println("hi--- i is " +i +"  and value of i is  "+arr[i]);
			}
			if(!isdistinct)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
