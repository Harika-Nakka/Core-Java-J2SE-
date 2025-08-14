package com.view;

import java.util.Scanner;

import com.controller.BankingService;

public class BankingManagementSystem {

	public static void main(String[] args) {
		BankingService service=new BankingService();
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        while(true) {
			System.out.println();
			System.out.println("..........Welcome to.........");
			System.out.println("..Banking Management System..");
			System.out.println();
			System.out.println("1.Create Customer");
			System.out.println("2.Create Account");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Check Balance");
			System.out.println("6.Get All Accounts");
			System.out.println("7.Exit");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter customer id : ");
				String id=scanner.next();
				System.out.print("Enter customer name : ");
				String name=scanner.next();
				service.createCustomer(id,name);
				break;
			case 2:
				System.out.print("Enter type of account : ");
				String type=scanner.next();
				System.out.print("Enter account number : ");
				String acc_number=scanner.next();
				System.out.print("Enter customer ID : ");
				String cus_id=scanner.next();
				System.out.print("Enter initial balance : ");
				double initial_balance=scanner.nextDouble();
				service.createAccount(type,acc_number,cus_id,initial_balance);
				break;
			case 3:
				System.out.print("Enter your account number : ");
				String dep_acc_number=scanner.next();
				System.out.print("Enter deposit amount : ");
				double dep_amount=scanner.nextDouble();
				service.deposit(dep_acc_number,dep_amount);
				break;
			case 4:
				System.out.print("Enter account number : ");
				String withdraw_acc_number=scanner.next();
				System.out.print("Enter amount : ");
				double amount=scanner.nextDouble();
				service.withdraw(withdraw_acc_number,amount);
				break;
			case 5:
				System.out.print("Enter account number : ");
				String check_acc_number=scanner.next();
				service.checkBalance(check_acc_number);
				break;
			case 6:
				service.displayAccounts();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid choice");
			}
        	
        }
	}

}
