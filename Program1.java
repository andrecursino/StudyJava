class Account {
    int number;
    String ownerAccount;
    double balance;
}

class Program1 {
    public static void main(String[] args) {
        Account myAccount;
        myAccount = new Account();

        myAccount.ownerAccount = "Duke";
        myAccount.balance = 1000.00;

        System.out.println("Current balance: " + myAccount.balance);
    }
}