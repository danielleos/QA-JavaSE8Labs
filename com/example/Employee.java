package com.example;

import java.text.NumberFormat;

public class Employee {
	//private variables
	private int empID;
	private String name;
	private String ssn;
	private double salary;
	private String role;
	private String dept;
	
	public static void main (String[] args) {
		// some code
	}	
	
	//Employee constructor
	public Employee(int empID, String name, String ssn, double salary) {
		this.empID = empID;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public Employee(String name, String role, String dept, double salary) {
		this.name = name;
		this.role = role;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	//setter methods
	public void changeName(String newName) {
		if (newName != null && !newName.isEmpty()) {
			if (newName.trim().length() > 0) {
				this.name = newName;
			}
		}
	}
	public void raiseSalary(double increase) {
		if (increase >= 0) {
			this.salary += increase;
		}
	}
	//getter methods
	public int getEmpID() { return empID; }
	public String getName() { return name; }
	public String getSsn() { return ssn; }
	public double getSalary() { return salary; }
	public String getDept() { return dept; }
	public String getRole() { return role; }

	public String toString() {
		return 	"Employee ID: " + empID + "\n" +
				"Employee Name: " + name + "\n" +
				"Employee SSN: " + ssn + "\n" +
				"Employee Salary: " + NumberFormat.getCurrencyInstance().format(getSalary());
	}
	
	//Helper inner class
	public class BenefitsHelper {
		private final double BONUS_RATE = 0.02;
		private final double WITHHOLDING_RATE = 0.07;
		public BenefitsHelper() {
		}
		
		protected double calculateBonus(double salary) {
			return salary * BONUS_RATE;
		}
		
		protected double calculateWithholding(double salary) {
			return salary * WITHHOLDING_RATE;
		}
	}
	
	private BenefitsHelper helper = new BenefitsHelper();
	//getter methods
	public double getWithholding() {
		return helper.calculateWithholding(salary);
	}
	public double getBonus() {
		return helper.calculateBonus(salary);
	}


}
