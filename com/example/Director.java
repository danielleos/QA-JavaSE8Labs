package com.example;

public class Director extends Manager {
	private double budget;
	
	public Director(int empID, String name, String ssn, double salary, String deptName, double budget) {
		super(empID, name, ssn, salary, deptName);
		this.budget = budget;
	}
	
	public double getBudget() {
		return budget;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Budget: " + budget;
	}

}
