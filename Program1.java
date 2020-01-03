class Account {
    int number = 1234;
    Client ownerAccount = new Client(); //when new Account is called, she will create a new Cliente
    double balance = 1000;
    double salary;

    boolean withdrawMoney (double quantity) {
        if (this.balance < quantity) {
            return false;
        } else {
            this.balance = this.balance - quantity;
            return true;
        }
    } 

    void cashDeposit (double quantity) {
        this.balance += quantity;
    }

    boolean transfer (Account destiny, double value) {
        boolean withdraw = this.withdrawMoney(value);
        if (withdraw == false) {
            return false;
        } else {
            destiny.cashDeposit(value);
            return true;
        }
    }
}

class Client {
    String name;
    String lastName;
    String cpf;
}

class Program1 {
    public static void main(String[] args) {
        //create account
        Account myAccount = new Account();
        Client c = new Client();

        myAccount.ownerAccount.name = "Duke";

        //c2 refference the c1 account
        Account c1 = new Account();
        c1.cashDeposit(100);
        Account c2 = new Account();
        c2.cashDeposit(200);

        c1.transfer(c2, 50);

        System.out.println(c1.balance);
        System.out.println(c2.balance);

        //changing values of my account
        myAccount.balance = 1000.00;

        //withdraw 200 reais
        myAccount.withdrawMoney(200.00);

        //deposit 500 reais
        myAccount.cashDeposit(500);

        //print the current balance
        System.out.println("Current balance: " + myAccount.balance);

        if (myAccount.withdrawMoney(2000)) {
            System.out.println("I can withdraw.");
        } else {
            System.out.println("I can't withdraw.");
        }
    }
}