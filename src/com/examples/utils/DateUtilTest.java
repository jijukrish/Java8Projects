package com.examples.utils;

import java.util.Calendar;

import org.junit.Test;

import junit.framework.TestCase;

public class DateUtilTest extends TestCase{

		@Test
		public void testDateExampleWithDefaultConstructorHasInitialisedTimeFields() {
			DateUtil date1 = new DateUtil();
			CheckTimeFieldsAreIntialised(date1);
		}
		
		@Test
		public void testCompareTodayAndTomorrow() {
			DateUtil date1 = new DateUtil();
			date1.add(Calendar.DAY_OF_MONTH, 1);
			DateUtil date2 = new DateUtil();
			assertTrue("date2(Tomorrow) is not after date1(Today)",date1.compareTo(date2)>0);
			assertTrue("date1(Tomorrow) is not after date2(Today)",date1.after(date2));
		}
		private void CheckTimeFieldsAreIntialised(final DateUtil date){
			assertEquals("The hour of day field is not initialised",0,date.get(Calendar.HOUR_OF_DAY));
			assertEquals("The hour field is not initialized",0,date.get(Calendar.HOUR));
			assertEquals("The minute field is not initialised",0,date.get(Calendar.MINUTE));
			assertEquals("The second field is not initialised",0,date.get(Calendar.SECOND));
			assertEquals("The millisecond field is not initialised",0,date.get(Calendar.MILLISECOND));
			assertEquals("The AM/PM field is not initialised",0,date.get(Calendar.AM_PM));
		}
}
