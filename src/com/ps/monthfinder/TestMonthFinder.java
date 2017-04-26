package com.ps.monthfinder;

public class TestMonthFinder {

	public static void main(String[] args) throws Exception{

	    MonthFinder mf=new MonthFinder();
		MonthFinderApp mfapp=new MonthFinderApp();
	
		String c=mf.findmonth(args[0]);
		
		try{
	    if(c.isEmpty())
	 	 {
	    	
		 System.out.println("app not working");
	 }else
	 
		 System.out.println(" working");
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		System.out.println(c.equals(mf));
	
	if(c.equals(mf))
			{
		System.out.println(c.equals(mf));
			}
	else
		System.out.println(c.charAt(1));
	try{
	int x=Integer.parseInt(c);
	System.out.println(x);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	

	}
	
			
	}
