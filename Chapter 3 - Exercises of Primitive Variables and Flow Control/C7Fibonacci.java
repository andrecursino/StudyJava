class C7Fibonacci {
    public static void main(String[] args) {
            int fibo = 0;
            int next1 = 0;
            int previous = 1;
            
            while (previous <= 100) {
                next1 = fibo + previous;
                System.out.println(next1);
                previous = fibo;
                fibo = next1;
            }
    }
}