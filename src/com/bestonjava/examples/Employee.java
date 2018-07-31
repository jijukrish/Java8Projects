package com.bestonjava.examples;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
}
