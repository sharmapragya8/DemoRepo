package com.Interview.JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str="pragya";
		
	}
	public void displayDuplicates(String str)
	{
		System.out.println();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char characters[]=str.toCharArray();
//		for(int i=0;i<i=characters.length;i++ )
//		{
//			
//		}
		for(char c: characters)
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				map.put(c, map.get(c)+1);
			}
			Set<Map<K, V>.entry<Character, Integer>> entrySet=map.entrySet();
			for(Map.Entry<Character, Integer>:entrySet)
			{
				if(entry.getValue()>1)
				{
					System.out.println("%s   :   %d ");
				}
			}
		}
	}

}
