package com.bestonjava.envmanagement.entity;

public class Environment {
	int enironmentId;
	String environmentName;
	String status;
	String osVersion;
	String dbName;
	String appServerName;
	String dbServerName;
	boolean isProd;
	
	public Environment() {
		// TODO Auto-generated constructor stub
	}
	public Environment(String envName, String status,String osVersion,String dbName,
			String appServerName, String dbServerName, boolean isProd){
		
	}
	public int getEnironmentId() {
		return enironmentId;
	}
	public String getEnvironmentName() {
		return environmentName;
	}
	public String getStatus() {
		return status;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public String getDbName() {
		return dbName;
	}
	public String getAppServerName() {
		return appServerName;
	}
	public String getDbServerName() {
		return dbServerName;
	}
	public boolean isProd() {
		return isProd;
	}
	
}
