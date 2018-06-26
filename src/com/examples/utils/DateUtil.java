package com.examples.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil extends GregorianCalendar{
	public static final int YEAR_DAYS =365;
	public static final int LEAP_YEAR_DAYS = 366;
	
	public DateUtil() {
		this((TimeSource.getCurrentTime()).getTime());
	}

	public DateUtil(long time) {
		// TODO Auto-generated constructor stub
	}
	public DateUtil(java.sql.Date date){
		this(date.getTime());
	}
	
	public DateUtil(int day,int month,int year){
		super(year,month,day);
	}
	
	//Method to set end time of a day
	protected static DateUtil endTimeOfDay(long time) {
		DateUtil date = new DateUtil(time);
		date.set(DateUtil.HOUR, 11);
		date.set(DateUtil.MINUTE, 59);
		date.set(DateUtil.SECOND, 59);
		date.set(DateUtil.MILLISECOND, 999);
		date.set(DateUtil.AM_PM, DateUtil.PM);
		return date;
	}
	
	public final int getYear() {
		return this.get(Calendar.YEAR);
	}
	
	public int getMonths(){
		return this.get(Calendar.MONTH);
	}
	public final int getDay() {
		return this.get(Calendar.DATE);
	}
	
	public final int getWeekDay() {
		return this.get(Calendar.DAY_OF_WEEK);
	}
	
	//Rertuns the amount of day in the year
	
	public final int daysInYear(){
		final int days;
		if(isLeapYear(getYear())) {
			days = LEAP_YEAR_DAYS;
			
		}else {
			days= YEAR_DAYS;
		}
		return days;
	}
}
