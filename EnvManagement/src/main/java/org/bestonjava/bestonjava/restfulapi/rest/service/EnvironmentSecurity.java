package main.java.org.bestonjava.bestonjava.restfulapi.rest.service;

@FunctionalInterface
public interface EnvironmentSecurity {
	//method contract that has to be overriden in all implemeting classes
	// Environment base class will implement this method to add security.
  public void addSecurity();
}
