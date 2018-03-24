package com.Interview.JavaPrograms;

public class CommonElementsInArray {

	public static void main(String[] args) {
//		int arr1[]= {4,6,8,9,2};
		int arr2[]= {3,6,8,9,6,4,8,5,7,1,3,8,6,8,3,6};
int count=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr2[i]==arr2[j])
				{
					count++;
				System.out.print(arr2[i]+"  ");
				break;
				
				}
				
				
			}
			
		}
		System.out.println("count  "+count);
		System.out.println();
		
	}

}
