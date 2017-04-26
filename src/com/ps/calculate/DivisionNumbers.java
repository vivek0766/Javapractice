package com.ps.calculate;

import com.ps.exceptions.*;

public class DivisionNumbers extends NotAValidInput {
	
	public DivisionNumbers()
	{
		System.out.println("division");
	}
public DivisionNumbers(int a,int b) throws NotAValidInput
{
	if(b==0)
	{
		System.out.println("input not valid");
	}
	else
		
		System.out.println("division result"+(a/b));
}
		

public DivisionNumbers(float a,float b) throws NotAValidInput
{
			
	if(b==0)
	{
		System.out.println("input not valid");
	}
	else
			
		System.out.println("division result"+(a/b));
}
	}



