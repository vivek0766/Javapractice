package com.ps.datatypes;

public class Addition extends Calculator implements Operators {

	@Override
	public void manipulate() {
		System.out.println("add two numbers");
		
		}
	public void calc()
	{
		int a=3;
		int b=4;
		
		System.out.println("addition" + a+b);
	}

}
