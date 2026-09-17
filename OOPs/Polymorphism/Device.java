class Device {
    void start() {
        System.out.println("Device is starting");
    }
}

class Phone extends Device {
    @Override
    void start() {
        System.out.println("Phone is starting");
    }
}

class Laptop extends Device {
    @Override
    void start() {
        System.out.println("Laptop is starting");
    }
}

class SmartWatch extends Device {
    @Override
    void start() {
        System.out.println("SmartWatch is starting");
    }
}

class Main {
    public static void main(String[] args) {
        Device d = new Phone();
        d.start();

        d = new Laptop();
        d.start();

        d = new SmartWatch();
        d.start();
    }
}
