package com.ps.monthfinder;

//import java.util.Scanner;

public class MonthFinderApp {

	public static void main(String[] args) throws Exception
	{
		/*try
		{
			Scanner reader = new Scanner(System.in);

		MonthFinder monthfind=new MonthFinder();
		String nameOfMonth = monthfind.findmonth(reader.next());
		System.out.println(nameOfMonth);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}*/
		
		//int s=Integer.parseInt(args[0]);
		MonthFinder monthfind=new MonthFinder();
		String m=monthfind.findmonth(args[0]);
		System.out.println("monthname"+m);
}
}
