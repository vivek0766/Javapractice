package com.ps.examples;

public class Palindrome {

	public String findIfStringIsPalindrome(String s) {
		String palindrome = s;

		System.out.println(palindrome.length());
		System.out.println(palindrome);
		System.out.print(palindrome.substring(2) + palindrome.substring(1, 2) + palindrome.charAt(0));
		String palindromes = palindrome.substring(2) + palindrome.substring(1, 2) + palindrome.charAt(0);
		try {
			if (palindromes.equalsIgnoreCase(palindrome)) {
				System.out.println("string is palindrome");
			} else
				System.out.println("not a palindrome");
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}

}
