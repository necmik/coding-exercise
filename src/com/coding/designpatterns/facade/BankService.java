package com.coding.designpatterns.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//Facade class
public class BankService {

	private Map<Integer, IAccount> bankAccounts;
	
	public BankService() {
		bankAccounts = new HashMap<>();
	}
	
	public int createNewAccount(String type, BigDecimal initAmount) {
		IAccount newAccount = null;
		switch (type) {
			case "chequing": newAccount = new Chequing(); break;
			case "saving" : newAccount = new Saving(); break;
			case "investment" : newAccount = new Investment(); break;
			default : System.out.println("Invalid account type"); break;
		}
		
		if (null != newAccount) {
			this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			return newAccount.getAccountNumber();
		}
		return -1;
	}
	
	public void transferMoney(int to, int from, BigDecimal amount) {
		IAccount toAccount = this.bankAccounts.get(to);
		IAccount fromAccount = this.bankAccounts.get(from);
		fromAccount.transfer(toAccount, amount);
	}
}
