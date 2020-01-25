class C8NewX {
    /*
    * Algorithm created to use remainder of division and while
    */

    public static void main(String[] args) {
        int x = 13;

        while (x > 1) {
            if (x % 2 == 0) {
                x = x / 2;
                System.out.println(x);
            } else {
                x = 3 * x + 1;
                System.out.println(x);
            }
        }
    }
}