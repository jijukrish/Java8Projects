package com.examples.utils;

import org.junit.Test;

import com.examples.exception.UnsupportedException;

import junit.framework.TestCase;

public class ObjectComparatorTest extends TestCase{
	
	@Test
	public void testObjectsEqualOrNot() throws UnsupportedException{
		Employee emp1=new Employee("Alex", "Java");
		Employee emp2=new Employee("Alex","J2EE");
		String str1 = "Tomato";
		String str2 = str1;
		assertEquals(1, ObjectComparator.compare(emp1, emp2));
		assertEquals(1, ObjectComparator.compare(str1, str2));
	}
	@Test
	public void testStringsEqualOrNot() throws UnsupportedException{
		String str1 = "Tomato";
		String str2 = str1;
		
		assertEquals(0, ObjectComparator.compare(str1, str2));
	}

}
