package com.bestonjava.envmanagement.service;

import com.bestonjava.envmanagement.entity.Environment;

public class EnvironmentServiceImpl implements EnvironmentService{
	//1=create, 2= update
	int envOpstatus;
	 @Override
	public int createEnvironment(Environment env) {
		/**
		 * Environment creation logic here and returns the created environments
		 */
		System.out.println("Created environments");
		
		//status 1 is created and 0 is not created
		if(env.getStatus().equals("1")){
			allEnvironmentList.add(env);
			
		} 
		return Integer.parseInt(env.getStatus());
	}
	
	 @Override
	public int updateEnviroment(Environment env) {
		// TODO Auto-generated method stub
		 /**
		  * Update environment and set status 2
		  */
		 return Integer.parseInt(env.getStatus());
	}
}
