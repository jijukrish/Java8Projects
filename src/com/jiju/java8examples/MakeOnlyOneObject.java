package com.jiju.java8examples;

public class MakeOnlyOneObject {
	public static void main(String args[]){
		SuperClassExample obj = new SuperClassExample("hi", "hello");
		SuperClassExample superObj = new SubClassExample("test1","test2");
		if(superObj.equals(obj)){
			
		}
		System.out.println(superObj);
	}

}
