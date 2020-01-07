public class main {
	public static void main(String[] args) {
		Account myAccount = new Account();
		myAccount.depositCash(100.00);

		System.out.println(myAccount.getBalance());
	}
}
