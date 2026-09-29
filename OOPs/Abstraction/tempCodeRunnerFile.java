
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
