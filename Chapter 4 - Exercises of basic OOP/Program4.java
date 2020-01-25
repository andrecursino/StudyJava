class Person {
    String name;
    int age;

    void haveBirthday(int years) {
        this.age += years;
    }

    String apresentation() {
        String introduction;
        introduction = "My name is " + this.name;
        introduction += "\nAnd my age is " + this.age;
        return introduction;
    }
}

class Program4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "André";
        p1.age = 25;

        System.out.println(p1.apresentation());

    }
}