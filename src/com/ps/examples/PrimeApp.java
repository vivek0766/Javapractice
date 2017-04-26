package com.ps.examples;

public class PrimeApp{

	public static void main(String[] args) throws Exception{

		
	int num=Integer.parseInt(args[0]);
		
		PrimeNumber primenum=new PrimeNumber();
		primenum.primenumberseries(num);
	}

}

