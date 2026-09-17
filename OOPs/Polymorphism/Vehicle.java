class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self start");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}
