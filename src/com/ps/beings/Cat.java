package com.ps.beings;

public class Cat extends Animals implements Pet {
/**
 * learning overriding 
 */
	@Override
	public void pettable() {
		// TODO Auto-generated method stub
    System.out.println("i am furry");
	}
public void says()
{
	System.out.println("Mew Mew");
}
}
