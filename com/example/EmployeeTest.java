package com.example;

import com.example.Employee;
import com.example.Engineer;
import java.text.NumberFormat;

//import java.text.NumberFormat;

import com.example.Director;
import com.example.Manager;
import com.example.business.EmployeeStockPlan;

public class EmployeeTest {

	public EmployeeTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Exercises 1 & 2
		/*Employee janeSmith = new Employee(101, "Jane Smith", "012-345-6789", 120_345.67);
		Manager johnDeere = new Manager(102, "John Deere", "123-456-7890", 150_123.89, "Sales");
		System.out.println(janeSmith.getDetails());
		System.out.println(johnDeere.getDetails());
		*/
		
		//Exercise 3
		Engineer janeSmith = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
		Manager barbaraJohnson = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
		Admin billMunroe = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
		Director susanWheeler = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
		
		/*System.out.println(janeSmith.printEmployee());
		System.out.println(barbaraJohnson.printEmployee());
		System.out.println(billMunroe.printEmployee());
		System.out.println(susanWheeler.printEmployee());
		*/
		
		//Tests
		/*billMunroe.changeName("John Deere");
		System.out.println(billMunroe.getName());
		
		barbaraJohnson.raiseSalary(30_000.00);
		System.out.println(barbaraJohnson.getSalary());
	
		janeSmith.raiseSalary(-9);
		System.out.println(janeSmith.getSalary());
		
		susanWheeler.changeName("");
		System.out.println(susanWheeler.getName());
		*/
		
		//Exercise 4
		EmployeeStockPlan esp = new EmployeeStockPlan();
		printEmployee(janeSmith, esp);
		printEmployee(barbaraJohnson, esp);
		printEmployee(billMunroe, esp);
		printEmployee(susanWheeler, esp);
		//printEmployee(janeSmith);
		
		// Create the classes as per the practice
        //Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        //Employee emp = new Employee(13, "Lionel Power", "099-90-6789", 67_990.90);
        Employee obj = new Engineer(102, "Robert Stock", "012-54-7812", 220_345.27);

        ((Engineer) obj).engineerMethod();
        printEmployee(obj);

        //Engineer engobj = new Employee(1, "Brenda Wills", "013-78-5678", 221_500.00);
        Employee engobj = new Employee(1, "Brenda Wills", "013-78-5678", 221_500.00);
        printEmployee(engobj);

        //Employee s = emp;
		
	}
	
	//Exercise 4
	/*public static void printEmployee(Employee e) {
		System.out.println("Employee Type: " + e.getClass().getSimpleName());
		System.out.println(e);
	}
	*/
	
	public static void printEmployee(Employee e, EmployeeStockPlan esp) {
		printEmployee(e);
		System.out.println("Stock Options: " + esp.grantStock(e));
	}
	
	public static void printEmployee(Employee emp) {
        System.out.println(); // Print a blank line as a separator
        // Print out the data in this Employee object
        System.out.println("Employee id:         " + emp.getEmpID());
        System.out.println("Employee name:       " + emp.getName());
        System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) emp.getSalary()));
    }
    

}
