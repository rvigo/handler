package br.com.accounts;

public class SavingsAccount implements Account {

	@Override
	public String getActionByAccountTypeNumber(String accountTypeNumber) {
		return accountTypeNumber;
	}
}
