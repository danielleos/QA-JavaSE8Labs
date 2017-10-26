package com.example;

import com.example.Account;

public class CheckingAccount extends Account{
	private final double overdraftLimit;
	
	public CheckingAccount(double balance, double overdraftLimit) {
		super(balance);
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(double balance) {
		this(balance, 0);
	}
	
	@Override
	public String getDescription() {
		return "Checking Account";
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount <= balance + overdraftLimit) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	

}
