package com.examples.utils;

public class PalindromeString {
	private static boolean isPalindrome(String str){
		if(str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}
	
	public static void main(String args[]) {
		String str1="aba";
		System.out.println(isPalindrome(str1));
	}
}
