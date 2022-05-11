package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
	List<BankAccount> accounts = new ArrayList<>();
	
	public void addAccount(String owner, double balance) {
		this.accounts.add(new BankAccount(owner,balance));
	}
	
	public void printAccounts() {
		for (BankAccount bankAccount : this.accounts) {
			System.out.println(bankAccount.getOwner() + "\t" + bankAccount.getBalance());
		}
	}
	
	public void printAccounts(double minBalance, double maxBalance) {
		for (BankAccount bankAccount : this.accounts) {
			if (bankAccount.getBalance() >= minBalance && bankAccount.getBalance() <= maxBalance) {
				System.out.println(bankAccount.getOwner() + "\t" + bankAccount.getBalance());
			}
		}
	}
	
	public BankAccount getAccount(String owner) {
		for (BankAccount bankAccount : this.accounts) {
			if (bankAccount.getOwner().equals(owner)){
				return bankAccount;
			};
		}
		
		return null;
	}
	
	public List<BankAccount> getAllAccounts(){
		return accounts;
	}
	
	public void sortBy(char c) {
		if (c == 'o') { //sort by owner
			Collections.sort(this.accounts, null);
		}
		else if (c == 'b') {
			Collections.sort(this.accounts, null);
		}
	}
}