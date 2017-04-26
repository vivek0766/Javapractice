package com.ps.examples;

public class PrintExamples {

	int noOfLines = 5;

	public void printStars() {
		for (int i = 0; i < noOfLines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public void printNumbers() {
		for (int i = 0; i < noOfLines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + " ");
			}

			System.out.println();
		}
	}

	public void printTriangleStars() {
		// print spaces
		for (int i = 0; i < noOfLines; i++) {
			for (int k = 0; k < (noOfLines - (i + 1)); k++) {
				System.out.print(" ");
			}
           for(int j=0;j<=i;j++)
           {
        	   System.out.print("*"+" ");
           }
		System.out.println();
		}
	}
		public void printTriangleNumbers() {
			// print spaces
			for (int i = 0; i < noOfLines; i++) {
				for (int k = 0; k < (noOfLines - (i + 1)); k++) {
					System.out.print(" ");
				}
	           for(int j=0;j<=i;j++)
	           {
	        	   System.out.print(j+1+" ");
	           }
			System.out.println();
			}
		
	}
}
