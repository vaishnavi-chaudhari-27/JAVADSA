// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog Barks");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }
// }

/*multilevel inheritance */

// class Animal {
//     void eat() {
//         System.out.println("Animal eat");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Puppy extends Dog {
//     void play() {
//         System.out.println("Puppy plays");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Puppy p = new Puppy();

//         p.eat();
//         p.bark();
//         p.play();
//     }
// }

/*  Hierarcical inheritance */

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meow");
    }

}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

    }
}
