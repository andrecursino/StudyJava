class age {
    public static void main (String[] args) {
        
        int age = 15;
        boolean ownerFriend = true;

        if (age < 18 && !ownerFriend) {
            System.out.println("Can't come in");
        } else {
            System.out.println("You may come in");
        }

        while (age < 18) {
            System.out.println(age);
            age = age + 1;
        }
        
    }
}
