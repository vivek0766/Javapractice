package com.ps.examples;

//import java.util.Arrays;

public class SearchNumberArray {
	
	public int searchArray(int number)
	{
		
		int[] sarray={1,2,3};
		int num=number;
		System.out.println(sarray.length);
		for(int i=0;i<sarray.length;i++)
		{
			if(sarray[i]==num)
			{System.out.println("number found");
			break;
		}
			}
				System.out.println("number not found");
			
	
		return num;
	}
}
