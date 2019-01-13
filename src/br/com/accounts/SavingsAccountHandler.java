package br.com.accounts;

import java.util.Arrays;
import java.util.List;

public class SavingsAccountHandler implements AccountHandler {
	@Override
	public List<String> actions() {
		return Arrays.asList("debit");
	}
}
