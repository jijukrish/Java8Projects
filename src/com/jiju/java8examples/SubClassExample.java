package com.jiju.java8examples;

public class SubClassExample extends SuperClassExample{
		private String subClaProperty1;
		private String subClaProperty2;
		public SubClassExample() { }
		public SubClassExample(String prop1,String prop2){
			subClaProperty1 = prop1 +"Sub";
			subClaProperty2 = prop2 +"Sub";
		}
		
		public String getSubClaProperty1() {
			return subClaProperty1;
		}
		public String getSubClaProperty2() {
			return subClaProperty2;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return subClaProperty1 + " ------ v " +  subClaProperty2;
		}
}
