package com.examples.utils;

import java.math.BigDecimal;

import com.examples.exception.UnsupportedException;

public class ObjectComparator implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String EMPTY="";
	private static final int EQUAL =0;
	private static final int GREATER=1;
	private static final int LESS =-1;
	
	//Default constructor
	public ObjectComparator() {
		super();
	}
	/**
	 * returns 0, 2 objects have equal value
	 * return 1, object1>object2
	 * return -1, object1 < object2
	 * @throws UnsupportedException 
	 */
	public static int compare(Object obj1, Object obj2) throws UnsupportedException{
		int result = EQUAL;
		boolean isResultSet = false;
		if(obj1 == null && obj2!= null){
			if(obj2 instanceof String){
				obj1 = EMPTY;
			} else {
				isResultSet = true;
				result = LESS;
			}
		} else if(obj1!=null && obj2== null){
			if(obj1 instanceof String){
				obj2 = EMPTY;
			} else {
				isResultSet = true;
				result = GREATER;
			}
		}
		if(isResultSet){
			return result;
		}
		
		//Check that 2 objects are the same class
		if(obj1.getClass() != obj2.getClass()){
			throw new ClassCastException("Objects to compare are not the same class");
		}
		
		if(obj1 instanceof String){
			result = ((String)obj1).compareTo((String)obj2);
		} else if(obj1 instanceof DateUtil){
			throw new UnsupportedException("Comparison method is not implemeted for this class" + obj1.getClass().getName());
		}else if(obj1 instanceof BigDecimal){
			throw new UnsupportedException("Comparison method is not implemeted for this class" + obj1.getClass().getName());
		}else{
			throw new UnsupportedException("Comparison method is not implemeted for this class" + obj1.getClass().getName());
		}
		return result;
	}
	
	/**
	 * Compare two in numbers
	 */
	
	public static int compare(int obj1,int obj2){
		if(obj1 == obj2) { return 0;}
		else if(obj1>obj2){ return 1;}
		else { return -1;}
	}
	
	/**
	 * Compare two double numbers
	 */
	
	public static int compare(double obj1,double obj2){
		if(obj1 == obj2) { return 0; }
		else if(obj1 > obj2){
			return 1;
		} else{ return -1; }
	}
}
