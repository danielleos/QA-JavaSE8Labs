package com.example.business;

import com.example.*;

public class EmployeeStockPlan {

	public EmployeeStockPlan() {
		// TODO Auto-generated constructor stub
	}

	public int grantStock(Employee e) {
		if (e instanceof Director) {
			return 1000;
		} else if (e instanceof Manager) {
			return 100;
		} else {
			return 10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
