package com.ps.calculatorApps;

import com.ps.calculate.AddNumbers;
import com.ps.calculate.DivisionNumbers;
import com.ps.calculate.MultiplicationNumbers;
import com.ps.calculate.SubtractNumber;
import com.ps.exceptions.NotAValidInput;

public class CalculatorApp {

	public static void main(String[] args) {

		AddNumbers anum=new AddNumbers();
		AddNumbers bnum=new AddNumbers(1,2);
		AddNumbers cnum=new AddNumbers(1.1f,1.2f);
		
		SubtractNumber asub=new SubtractNumber();
		SubtractNumber bsub=new SubtractNumber(2,3);
		SubtractNumber csub=new SubtractNumber(2.3f,4.5f);
		
		MultiplicationNumbers amul=new MultiplicationNumbers();
		MultiplicationNumbers bmul=new MultiplicationNumbers(3,4);
		MultiplicationNumbers cmul=new MultiplicationNumbers(2.5f,4.5f);
		
		DivisionNumbers adiv=new DivisionNumbers();
		try {
			DivisionNumbers bdiv=new DivisionNumbers(3,5);
		} catch (NotAValidInput e) {
			e.printStackTrace();
		}
		try {
			DivisionNumbers cdiv=new DivisionNumbers(2.3f,4.5f);
		} catch (NotAValidInput e) {
			e.printStackTrace();
		}
		try{
			DivisionNumbers ddiv=new DivisionNumbers(3,0);
		}
		catch(NotAValidInput e)
		{
			e.printStackTrace();
	}
	}

}
