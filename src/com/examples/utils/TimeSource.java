package com.examples.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * An utility class the current date/time to the application.The value
 * returned will default to the JVM time 
 * @author jijukrishnan
 *
 */
public class TimeSource {
	protected static Calendar _currentDate = null;
	private static int _yearFixed = 0;
	private static int _monthFixed =0;
	private static int _dateFixed= 0;
	public static Date getCurrentTime() {
		if(_currentDate != null){
			Calendar systemTime = Calendar.getInstance();
			systemTime.set(_yearFixed, _monthFixed,_dateFixed);
			return systemTime.getTime();
		}
		return Calendar.getInstance().getTime();
	}
	
	/**
	 * Initialise the date to fixed date
	 */
	public static void initialiseFixed(Date fixedDate){
		if(_currentDate == null) {
			_currentDate = Calendar.getInstance();
			_currentDate.setTime(fixedDate);
			_yearFixed= _currentDate.get(Calendar.YEAR);
			_monthFixed= _currentDate.get(Calendar.MONTH);
			_dateFixed = _currentDate.get(Calendar.DATE);
		} else {
			StringBuffer dateMsg = new StringBuffer();
			dateMsg.append("TimeSource can only be initialised once");
			throw new IllegalStateException(dateMsg.toString());
		}
	}
}
