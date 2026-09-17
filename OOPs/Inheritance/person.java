// class person {
//     String name = "Parent";
// }

// class Student extends person {
//     String name = "Student";

//     void display() {
//         System.out.println(name);
//         System.out.println(super.name);
//     }

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//     }
// }

/* super() constructor */

class person {
    person() {
        System.out.println("Person Constructor");
    }
}

class Student extends person {
    Student() {
        super();
        System.out.println("Student Constructor");
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}