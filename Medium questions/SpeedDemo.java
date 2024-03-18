class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int speed;

    Car(int carSpeed, int vehicleSpeed) {
        super(vehicleSpeed); // Call the superclass constructor
        this.speed = carSpeed;
    }

    void displaySpeed() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed);
    }
}

public class SpeedDemo {
    public static void main(String[] args) {
        int carSpeed = 100;
        int vehicleSpeed = 200;

        Car myCar = new Car(carSpeed, vehicleSpeed);
        myCar.displaySpeed();
    }
}
