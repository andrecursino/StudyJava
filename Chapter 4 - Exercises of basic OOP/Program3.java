class Account {
    String ownerAccount;
    int numberAccount;
    String agencyAccount;
    double balance;
    String openingDate;

    void withdrawMoney(double quantity) {
        if(this.balance < quantity) {
            System.out.println("Unauthorized Operation\n" +
            "Your balance is not suffieciente");
        } else {
            this.balance -= quantity;
        }
    }

    void cashDeposit(double quantity) {
        this.balance += quantity;
    }

    double yieldProfit() {
        double profit = this.balance * 0.1;
        return profit;
    }

    String getDataForPrinting() {
        String data;
        data = "Owner Account: " + this.ownerAccount;
        data += "\nNumber of Account: " + this.numberAccount;
        data += "\nCurrent balance: " + this.balance;
        data += "\nYield for the current balance: " + this.yieldProfit();

        return data;
    }
}

class Program3 {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.balance = 300;
        myAccount.yieldProfit();
        
        System.out.println(myAccount.yieldProfit());

        Account c1 = new Account();
        c1.ownerAccount = "Hugo";
        c1.numberAccount = 123;
        c1.agencyAccount = "4567-7";
        c1.balance = 50;
        c1.openingDate = "16/04/2017";

        c1.cashDeposit(100);
        System.out.println("Current balance: " + c1.balance);
        System.out.println("Monthly earnings: " + c1.yieldProfit());

        System.out.println(c1.getDataForPrinting());
    }
}