package com.controller;
import java.util.Collection;
import java.util.HashMap;

import com.model.Account;
import com.model.CurrentAccount;
import com.model.Customer;
import com.model.SavingsAccount;

public class BankingService {
	HashMap<String, Customer> customers=new HashMap<String, Customer>();
	HashMap<String, Account> accounts=new HashMap<String, Account>();
	public void createCustomer(String id, String name) {
		if(customers.containsKey(id)==false) {
			Customer customer=new Customer(id,name);
			customers.put(id,customer);
			System.out.println("Customer created sucessfully");
		}
		else {
			System.out.println("Customer ID already exists");
		}
	}
	public void createAccount(String type, String acc_number, String cus_id, double initial_balance) {
		if(customers.containsKey(cus_id)==true) {
			Customer customer=customers.get(cus_id);
			if(type.equals("current")) {
				Account account=new CurrentAccount(acc_number,customer,initial_balance);
				accounts.put(acc_number, account);
				System.out.println("Current Account created successfully");
			} else if(type.equals("savings")) {
				Account account=new SavingsAccount(acc_number,customer,initial_balance);
				accounts.put(acc_number, account);
				System.out.println("Savings Account created successfully");
			} else {
				System.out.println("Invalid account type");
			}
		} else {
			System.out.println("Invalid customer ID");
		}
	}
	public void deposit(String dep_acc_number, double dep_amount) {
		if(accounts.containsKey(dep_acc_number)==true) {
			Account account=accounts.get(dep_acc_number);
			account.deposit(dep_amount);
			System.out.println("Amount deposited sucessfully");
		} else {
			System.out.println("Invalid account number");
		}
	}
	public void checkBalance(String check_acc_number) {
		if(accounts.containsKey(check_acc_number)==true) {
			Account account=accounts.get(check_acc_number);
			System.out.print("Available Balance : "+account.getBalance());
			System.out.println();
		} else {
			System.out.println("Invalid account number");
		}
	}
	public void withdraw(String withdraw_acc_number, double amount) {
		if(accounts.containsKey(withdraw_acc_number)==true) {
			Account account=accounts.get(withdraw_acc_number);
			account.withdraw(amount);
			System.out.println("Amount withdraw sucessfully");
		} else {
			System.out.println("Invalid account number");
		}
	}
	public void displayAccounts() {
		Collection<Account> accList=accounts.values();
		for(Account acc:accList) {
			System.out.println(acc);
}
	}
}
