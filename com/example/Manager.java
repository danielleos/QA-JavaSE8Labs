package com.example;

public class Manager extends Employee {
	private String deptName;
	
	public Manager(int empID, String name, String ssn, double salary, String deptName) {
		super(empID, name, ssn, salary);
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	//get details for Manager using @Override notation
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Department: " + deptName;
	}

}