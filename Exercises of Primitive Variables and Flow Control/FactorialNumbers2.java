class FactorialNumbers2 {
    public static void main(String[] args) {

        long fact = 1;

        for(long i = 1; i < 40; i++) {
            fact = fact * i;
            System.out.println(fact);
        }

    }
}