package br.com.andrecursino.accountbank.main;

import br.com.andrecursino.accountbank.Bank;;

public class main {
	public static void main(String[] args) {
		Bank myBank = new Bank();
		myBank.bankName = "Banco do Brasil";
		System.out.println(myBank.bankName);
	}
}
