package com.ps.examples;

public class PrimeNumber {

	public void primenumberseries(int n)
	{
		try
		{
		if(n==1)
		{
			System.out.println("1 is neither prime nor composite");
		}
		else if(n==2 || n==3)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println(n+"is prime");
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"not prime");
					break;
				}
							}
			

			
		}
	}
		
		catch(Exception e)
{
	System.out.println(e);
}
	
	}
	}


