abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}



abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stops");
    }

}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike Starts");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}




abstract class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog bark");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}



abstract class Payment {
    abstract void pay();

    void receipt() {
        System.out.println("Receipt generated");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment Using UPI");
    }
}

public class Abstract {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
        u.receipt();
    }
}