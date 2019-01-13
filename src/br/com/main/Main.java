package br.com.main;

import br.com.accounts.AccountTypeMapping;
import br.com.models.Account;

public class Main {

	public static void main(String[] args) {		
		//creating the account object for each type mapped before ("1" and "2")
		Account current = createAccount("1");
		Account savings = createAccount("2");
		
		//printing the list of available actions for each account type
		System.out.println(current.getAvailableActions());
		System.out.println(savings.getAvailableActions());
	}

	private static Account createAccount(String accountTypeNumber) {

		Account account = new Account();
		account.setAvailableActions(AccountTypeMapping.getActions(accountTypeNumber));
		
		return account;
	}
}
