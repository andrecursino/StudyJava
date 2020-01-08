package br.com.andrecursino.accountbank;

public class Account {
	
	private double balance;
	String ownerAccount;
	int numberAccount;
	String bankAgency;
	
	public void depositCash (double quantity){
		this.balance += quantity;
	}
	
	public double withdrawMoney(double quantity) {
		this.balance -= quantity;
		return this.balance;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getBankAgency() {
		return bankAgency;
	}

	public void setBankAgency(String bankAgency) {
		this.bankAgency = bankAgency;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}
	
	
}
