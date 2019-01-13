package br.com.models;

import java.util.List;

public class Account {
	private String accountNumber;
	private String agencyNumber;
	private String accountTypeNumber;
	private String accountOwnerName;
	private List<String> availableActions;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public String getAccountTypeNumber() {
		return accountTypeNumber;
	}

	public void setAccountTypeNumber(String accountTypeNumber) {
		this.accountTypeNumber = accountTypeNumber;
	}

	public String getAccountOwnerName() {
		return accountOwnerName;
	}

	public void setAccountOwnerName(String accountOwnerName) {
		this.accountOwnerName = accountOwnerName;
	}

	public List<String> getAvailableActions() {
		return availableActions;
	}

	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}
}
