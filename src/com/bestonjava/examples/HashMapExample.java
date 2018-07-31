package com.bestonjava.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]){
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(1,"Jiju"), "java");
		map.put(new Employee(2,"Siju"),"J2EE");
		map.put(new Employee(3,"Biju"), "Angular");
		System.out.println(map);
	}
}
