class C9Fors {
    public static void main(String[] args){
        
        int x;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                x = i * j;
                System.out.print(x + " ");
            }
            System.out.println("\n");
        }
    }
}