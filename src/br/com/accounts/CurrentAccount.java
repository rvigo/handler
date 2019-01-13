package br.com.accounts;

public class CurrentAccount implements Account {
	@Override
	public String getActionByAccountTypeNumber(String accountTypeNumber) {
		return accountTypeNumber;
	}
}
