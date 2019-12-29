class BalanceQuarter {
    public static void main(String[] args) {
        //declare and initialization of variables
        int januarySpending = 15000;
        int februarySpending = 23000;
        int marchSpending = 17000;

        //sum variable
        int quarterSpending = januarySpending + februarySpending + marchSpending;

        //avarage spending
        int avarageSpending = quarterSpending / 3;

        //print the sum variable and avarage
        System.out.println("Sum of the first quarter: " + quarterSpending);
        System.out.println("Montly avarage value: " + avarageSpending);
    }
}