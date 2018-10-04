package com.jiju.java8examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class FilteringNames {
	public static void main(String... args){
		List<Employee> employees =Arrays.asList(new Employee("John","Smith","TA"),
				new Employee("John","Sinclair","TA"),new Employee("John","Sinclair","TA"),
				new Employee("John","Hunter","BA"),new Employee("John","Salvo","DEV"),
				new Employee("Sarah","Files","BA"),new Employee("Sarah","Kate","DEV"),
				new Employee("Kate","Williams","BA"),new Employee("John","Paul","DEV"));
		List<Employee> TA = filterDepartments(employees, FilteringNames::isTA);
		List<Employee> DEV = filterDepartments(employees, FilteringNames::isDev);
		System.out.println(TA);
		System.out.println(DEV);
	}
	
	public static boolean isTA(Employee employee){
		return "TA".equals(employee.getDept());
	}

	public static boolean isDev(Employee employee) {
	    return "DEV".equals(employee.getDept());
	}
	public static List<Employee> filterDepartments(List<Employee> employees,Predicate<Employee> p){
		List<Employee> result = new ArrayList<>();
		for(Employee employee:employees){
			if(p.test(employee)){
				result.add(employee);
			}
		}
		return result;
	}
	
	public static class Employee {
	    private String firstName = "";
	    private String lastName = "";
	    private String dept = "";

	    public Employee(String firstName, String lastName,String dept){
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dept = dept;
	    }

	    

	    public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public String getDept() {
			return dept;
		}



		public void setDept(String dept) {
			this.dept = dept;
		}



		public String toString() {
	        return "Employee{" +
	               "firstName='" + firstName + '\'' +
	               ", lastName=" + lastName + '\'' +
	               ", Dept=" + dept +
	               '}';
	    }
	}
}
