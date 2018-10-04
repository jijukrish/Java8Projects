/**
 * Program to remove duplicates from arrayList
 * author:jijukrishnan
 */
package com.jiju.java8examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
	

	  public static void main(String[] args) {
	 
	     /* Creating ArrayList of Strings and adding
	      * elements to it
	      */
	     List<String> al = new ArrayList<String>();
	     al.add("Anish");
	     al.add("Jiju");
	     al.add("Remya");
	     al.add("Vinod");
	     al.add("Jiju");
	     al.add("SUper");
	     al.add("jiju");
	 
	     // Displaying ArrayList elements 
	     System.out.println("Before:");
	     System.out.println("ArrayList contains: "+al);
	 
	     // Creating LinkedHashSet
	     LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	 
	     /* Adding ArrayList elements to the LinkedHashSet
	      * in order to remove the duplicate elements and 
	      * to preserve the insertion order.
	      */
	     lhs.addAll(al);
	  
	     // Removing ArrayList elements
	     al.clear();
	 
	     // Adding LinkedHashSet elements to the ArrayList
	     al.addAll(lhs);
	 
	     // Displaying ArrayList elements
	     System.out.println("After:");
	     System.out.println("ArrayList contains: "+al);
	  }
	
}
