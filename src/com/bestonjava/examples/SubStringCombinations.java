package com.bestonjava.examples;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringCombinations {
	public static List<List<String>> substrings(final String input) {
	    if(input.isEmpty())
	        return Collections.emptyList();
	    final int size = 1 << (input.length()-1); 
	    return new AbstractList<List<String>>() {

	        @Override
	        public List<String> get(int index) {
	            List<String> entry = new ArrayList<>();
	            int last = 0;
	            while(true) {
	                int next = Integer.numberOfTrailingZeros(index >> last)+last+1;
	                if(next == last+33)
	                    break;
	                entry.add(input.substring(last, next));
	                last = next;
	            }
	            entry.add(input.substring(last));
	            return entry;
	        }

	        @Override
	        public int size() {
	            return size;
	        } 
	    };
	}

	public static void main(String[] args) {
	    System.out.println(substrings("Australia"));
	    
	}
}
