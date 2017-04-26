package com.ps.datatypes;

public class Multiplication extends Calculator implements Operators {

	@Override
	public void manipulate() {
		
		System.out.println("multiply two numbers");

	}
	public void calc()
	{
		double a=3.22;
		int b=4;
		
		System.out.println("Multiplication" + (a*b));
	}

}
