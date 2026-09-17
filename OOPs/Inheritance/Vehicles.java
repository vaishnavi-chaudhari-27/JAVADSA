class Vehicles {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicles {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}
