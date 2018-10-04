package com.examples.utils;

public class StringIntern {
	public static void main(String args[]){
		String str1="JavaCodeGeeks";
		String str2="JavaCodeGeeks";
		String str3 ="JavaCodeGeeks".intern();
		String str4 = new String("JavaCodeGeeks");
		System.out.println("Are str1 and str2 the same: " + (str1 == str2));
		
		        System.out.println("Are str1 and str3 the same: " + (str1 == str3));
		
		        System.out.println("Are str1 and str4 the same: " + (str1 == str4)); //this should be "false" because str4 is not interned        
		
		        System.out.println("Are str1 and str4.intern() the same: " + (str1 == str4.intern())); //this should be "true" now            
	}
}
