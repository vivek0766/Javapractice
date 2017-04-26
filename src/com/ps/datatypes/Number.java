package com.ps.datatypes;

public class Number extends Calculator implements Operators {
	
	public void calc()
	{
		Integer x=2;
		Integer y=3;
	    boolean z=x.equals(y);
	    
	    if (z)
	    {
	    	System.out.println("two values are equal");
	    }
	    else
	    	System.out.println("not equal");
	   int  a=y.compareTo(x);
	  if(a<0)
	   {
		   System.out.println("y<x");
	   }else if(a>0)
	   {
	   System.out.println("y>x");
	   }else 
		   System.out.println("y=x");
	  
	  int e=x.shortValue();
	  System.out.println("shortvalue"+e);
	 System.out.println("doublevalue"+ y.doubleValue());
	// x.sum(a, b)
	 System.out.println("");
	  
	  
	}

	@Override
	public void manipulate() {
		System.out.println("integer  class functions");
		
	}
	    
}
	    
	

