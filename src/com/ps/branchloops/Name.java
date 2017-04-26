package com.ps.branchloops;

public class Name extends Repeatition{

	public void dataloop()
	{
		
		
		String a="first";
		String b="second";
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("strings are equal");
			
		}else 
			System.out.println("strings are not equal");
		
			if(a.isEmpty())
			{
				System.out.println("empty string");
				
			}else 
				System.out.println("not empty"+ a.length());
			
	
	
	int i1=0;
			
			 int c= a.compareToIgnoreCase(b);
			System.out.println("result"+c);
			 
			try{
				System.out.println("show"+ a.indexOf(i1));
			
			for(i1=0;i1>=b.lastIndexOf(c);)
				
				
			{
				System.out.println("show"+ a.indexOf(i1));
				break;
			}
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
				
				System.out.println(""+i1+  a.toUpperCase()+ b.toLowerCase());
				
				
				System.out.println("concatination" + a.concat(b));
				
				System.out.println("Bytearray"+ b.getBytes());
				 int i2=0;
				try{
				
					System.out.println("substring"+b.substring(i2, 3));
								
				for(i2=a.indexOf(b.substring(i2, 3));i2>=0;)
				{
					System.out.println("showstring"+ b.substring(i2));
					
					char x=b.charAt(i2);
					System.out.println("showchar"+ x );
				break;
				}
					
				
			}
				catch(Exception e)
				{
					System.out.println("exception"+ e);
				}
				 int i3=0;
				 System.out.println("reverse"+ b.replaceFirst(b,a) );

				try{
					for(i3=a.length();i3<0;)
					{
				System.out.println("reverse"+ a.charAt(i3));
					break;
					}
				}
				catch(Exception e)
				{
					System.out.println("exception"+e);
				}
}
	}
	
				
		


