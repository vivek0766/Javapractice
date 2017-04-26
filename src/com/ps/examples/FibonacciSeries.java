package com.ps.examples;

public class FibonacciSeries {

	public void fibseries(int numberinput)
	{
	
		int firstnumber,secondnumber,thirdnumber;
		firstnumber=0;
		secondnumber=1;
		thirdnumber=0;
		System.out.print(firstnumber+" "+secondnumber);
		thirdnumber=firstnumber+secondnumber;
		System.out.print(" "+thirdnumber);
		
for(int repeat=1;repeat<=numberinput;repeat++)
		{
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			thirdnumber=firstnumber+secondnumber;
			System.out.print(" "+thirdnumber);
		}
	}
}
