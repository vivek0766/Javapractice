package com.ps.datatypes;

public class Modulus extends Calculator implements Operators {

	@Override
	public void manipulate() {
		System.out.println("Reminder of division of two numbers");

	}
public void calc()
{
	float a=5;
	float b=3;
	
	System.out.println("Reminder" + a%b );
}
}
