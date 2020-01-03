class Car {
    String color;
    String model;
    double currentSpeed;
    double maxSpeed;
    Motor motor = new Motor();
    
    //turn on the car
    void turnOn() {
        System.out.println("The car is on");
    }

    //speed up a little
    void speedUp(double quantity) {
        double newSpeed = this.currentSpeed + quantity;
        this.currentSpeed = newSpeed;
    }

    //show the current march
    int getMarch() {
        if (this.currentSpeed < 0) {
            return -1;
        } 
        if (this.currentSpeed >= 10 && this.currentSpeed < 40) {
            return 1;
        }
        if (this.currentSpeed >= 40 && this.currentSpeed < 80) {
            return 2;
        }
        return 3;
    }
}

class Motor {
    int power;
    String type;
}

class Program2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Green";
        myCar.model = "Beetle";
        myCar.currentSpeed = 0;
        myCar.maxSpeed = 80;

        myCar.turnOn();

        myCar.speedUp(20);
        System.out.println(myCar.currentSpeed);
    }
}