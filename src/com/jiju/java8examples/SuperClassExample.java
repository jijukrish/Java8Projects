package com.jiju.java8examples;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class SuperClassExample {
  /*
   * This is s super class. Sub classes can inherit this
   */
	private String superClaProperty1;
	private String superClaProperty2;
	public SuperClassExample() { }
	public SuperClassExample(String prop1, String prop2){
		superClaProperty1 = prop1;
		superClaProperty2 = prop2;
	}
	public String getSuperClaProperty1() {
		return superClaProperty1;
	}
	public String getSuperClaProperty2() {
		return superClaProperty2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return superClaProperty1 + " ------ v " +  superClaProperty2;
	}
}
