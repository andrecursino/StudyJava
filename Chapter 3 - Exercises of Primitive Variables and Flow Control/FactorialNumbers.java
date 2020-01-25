class FactorialNumbers {
    public static void main(String[] args) {
        int i = 0;
        int fact = 1;

        while (i < 10) {
            i++;
            fact = fact * i;
            System.out.println(fact);
        }
        
    }
}