package com.ps.datatypes;

public class Division extends Calculator implements Operators {

	@Override
	public void manipulate() {
		System.out.println("Division of two numbers");
	}
public void calc()
{
	int a=6;
	int b=4;
	
	if (a>b){
	
	System.out.println("Division" + (a/b));

}
	else 
		System.out.println("Division" + (b/a));
}
}
