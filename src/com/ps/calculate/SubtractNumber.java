package com.ps.calculate;

public class SubtractNumber {

	public SubtractNumber()
	{
		System.out.println("difference");
	}
 public SubtractNumber(int a,int b)
 {
	 if(a>b){
	 System.out.println("difference"+ (a-b));
 }
	 else
		
	 System.out.println("difference"+ (b-a));
 }
 
 public SubtractNumber(float a, float b)
 {
	 if (a>b)
	 {
	 System.out.println("difference"+ (a-b));
 }
	 else
		 
		 System.out.println("difference"+(b-a));
 }
}
