package com.jiju.java8examples;

import org.junit.Test;

import junit.framework.TestCase;

public class FormatNumbersToStringTest extends TestCase{
	@Test
	public void testchangeNumberToString(){
		assertEquals("Output of 34", "Thirty Four", FormatNumbersToString.convert(34));
	}
	@Test
	public void testchangeNumberToStringFail(){
		assertEquals("Output of 34", "Thirty Six", FormatNumbersToString.convert(34));
	}
	
}
