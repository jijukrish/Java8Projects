package com.examples.exception;

public class UnsupportedException extends Exception{
	String errorMsg;
	public UnsupportedException() {
		
	}
	
	public UnsupportedException(String msg){
		errorMsg = msg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return errorMsg;
	}

}
