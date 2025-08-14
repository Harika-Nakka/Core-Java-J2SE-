package com.model;

public abstract class Account {
     private String account_number;
     private Customer customer;
     private double balance;
     
	public Account(String account_number, Customer customer, double balance) {
		this.account_number = account_number;
		this.customer = customer;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [" + account_number + " " + customer + " " + balance + "]";
	}
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public final void deposit(double amount) {
		balance=amount+balance;
	}
	
     public abstract void withdraw(double amount);

}
