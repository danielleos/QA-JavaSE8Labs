package com.example;

public class Engineer extends Employee {

	public Engineer(int empID, String name, String ssn, double salary) {
		super(empID, name, ssn, salary);
	}
	
	public String engineerMethod() {
		return "Engineer Method";
	}

}
