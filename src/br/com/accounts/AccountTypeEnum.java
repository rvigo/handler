package br.com.accounts;

public enum AccountTypeEnum {
	CURRENT("1"), SAVINGS("2");

	private String accountTypeNumber;

	AccountTypeEnum(String accountTypeNumber) {
		this.accountTypeNumber = accountTypeNumber;
	}

	public String getAccountTypeNumber() {
		return this.accountTypeNumber;
	}
}
