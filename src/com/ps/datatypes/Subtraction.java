package com.ps.datatypes;

public class Subtraction extends Calculator implements Operators {

	@Override
	public void manipulate() {
	
	System.out.println("subtract two numbers");

	}
	
	public void calc()
	{
		int a=3;
		int b=2;
		
		if(a>b)
		{
			System.out.println("subtraction" + (a-b));
		}else 
			System.out.println("subtraction" + (b-a));
	
	}

}
