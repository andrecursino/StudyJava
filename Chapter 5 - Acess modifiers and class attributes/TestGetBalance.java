class Account {
    private static int totalAccounts;
    String ownerAccount;
    int number;
    double balance;
    double creditLimit;

    public double getBalance() {
        return this.balance + this.creditLimit;
    } 

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String owner) {
        this.ownerAccount = owner;
    }

    public static int getTotalAccounts() {
        return Account.totalAccounts;
    }

    Account (String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    Account (int number, String ownerAccount) {
        this(ownerAccount);
        this.number = number;
        Account.totalAccounts = totalAccounts + 1;
    }

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
    private String name;
    private String adress;
    private String cpf;
    private int age;

    public void changeCPF (String cpf) {
        if (this.age <= 60) {
            //validaCPF(cpf);
        }
        this.cpf = cpf;
    }


}

class TestGetBalance {
    static public void main(String[] args) {
        Account myAccount = new Account(1234, "Daniel");
        int total = Account.getTotalAccounts();
        myAccount.cashDeposit(1000);
        System.out.println(myAccount.getBalance());
        System.out.println(total);
    }
}