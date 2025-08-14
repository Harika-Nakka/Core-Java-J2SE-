package com.model;

public class SavingsAccount extends Account{
    private static final double MINIMUM_BALANCE=1000.00;
	public SavingsAccount(String account_number, Customer customer, double balance) {
		super(account_number, customer, balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance()-amount>=MINIMUM_BALANCE) {
		setBalance(getBalance()-amount);
		}else {
			System.out.println("Minimum Balance should be 1000.00");
		}
	}
        

}
