package com.ps.examples;

public class PalUserGiven {
	
	public String findIfStringIsPalindrome1(String s) {
		String palindrome =s;
		String palindromes1="";

		System.out.println(palindrome.length());
		System.out.println(palindrome);
		int l=palindrome.length();
		for(int i=l-1;i>=0;i--)
		{
				 palindromes1 = palindromes1+palindrome.charAt(i);
		}
		try {
			if (palindromes1.equalsIgnoreCase(palindrome)) {
				System.out.println("string is palindrome");
			} else
				System.out.println("not a palindrome");
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}


}
