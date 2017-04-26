package com.ps.calcApps;

import com.ps.datatypes.Addition;
import com.ps.datatypes.Calculator;
import com.ps.datatypes.Division;
import com.ps.datatypes.Modulus;
import com.ps.datatypes.Multiplication;
import com.ps.datatypes.Operators;
import com.ps.datatypes.Subtraction;
import com.ps.datatypes.Number;

public class CalcApps {

	public static void main(String[] args) {
		
		 Calculator acalc= new Calculator();
		 Calculator bcalc=new Addition();
		 Calculator ccalc=new Subtraction();
		 Calculator dcalc=new Multiplication();
		 Calculator ecalc=new Division();
		 Calculator fcalc=new Modulus();
		 Calculator gcalc=new Number();
		 
		 acalc.calc();
		 bcalc.calc();
		 ccalc.calc();
		 dcalc.calc();
		 ecalc.calc();
		 fcalc.calc();
		 gcalc.calc();
		 
		 Operators aoper=new Addition();
		 Operators boper=new Subtraction();
		 Operators coper=new Multiplication();
		 Operators doper=new Division();
		 Operators eoper=new Modulus();
		 Operators foper=new Number();
		 
		 
		 aoper.manipulate();
		 boper.manipulate();
		 coper.manipulate();
		 doper.manipulate();
		 eoper.manipulate();
		 foper.manipulate();
		 
		 
		

	}

}
