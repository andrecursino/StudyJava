class Sum1to1000 {
    public static void main(String[] args) {
        
        int i = 0;
        int sum = 0;
        
        while (i <= 1000) {
            sum = sum + i;
            if (i == 1000) {
                System.out.println("Adding 1 to 1000 equals " + sum);
            }
            i++;
        }
    }
}