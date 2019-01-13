package br.com.accounts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountTypeMapping {
	private AccountTypeMapping() {
	}

	/**
	 *mapping the account type number to an account type
	 */
	private static Map<String, AccountHandler> accounts = new HashMap<>();
	static {
		accounts.put("1", new CurrentAccountHandler());
		accounts.put("2", new SavingsAccountHandler());
	}

	/**
	 * return all available actions for the account
	 * @param accountTypeNumber
	 * @return
	 */
	public static List<String> getActions(String accountTypeNumber) {
		return accounts.get(accountTypeNumber).actions();
	}
}
