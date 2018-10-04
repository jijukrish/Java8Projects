package com.examples.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TraversingInCollections {
	public static void main(String[] args){
		List<String> strList = new ArrayList<>();
		strList.add("01/01/1970,John,Smith,81.5,160.0");
		strList.add("31/01/1975,Jane,Doe,61.1,155.0");
		strList.add("28/11/1988,Bob,Big,102.4,145.0");
		strList.add("01/01/1970,John,Smith,81.5,160.0");
		//using for-each loop
		for(String obj : strList){
		    System.out.println(obj);
		}
		HashMap m = new HashMap();
		//using iterator
		Iterator<String> it = strList.iterator();
		while(it.hasNext()){
		    String obj = it.next();
		    System.out.println(obj);
		}
	}
}
