package com.bestonjava.envmanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.bestonjava.envmanagement.entity.Environment;

public interface EnvironmentService {
	List<Environment> allEnvironmentList = new ArrayList<Environment>();
	int createEnvironment(Environment env);
	int updateEnviroment(Environment env);
	default int addEnvironments(Environment env){
		int newenv= createEnvironment(env);
		if(newenv == 1)
		allEnvironmentList.add(env);
		if(allEnvironmentList.size() == 0){
			return -1;
		}else if(allEnvironmentList.size() > 0) {
			return 1;
		}
		return 0;
	}
}
