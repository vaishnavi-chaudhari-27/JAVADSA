// class Person {
//     void show() {
//         System.out.println("This is Person");
//     }
// }

// class Student extends Person {
//     void show() {
//         super.show();
//         System.out.println("This is Student");
//     }

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.show();
//     }
// }

class Teachar {
    void teach() {
        System.out.println("Teachiing all subjects");
    }
}

class MathTeacher extends Teachar {
    @Override 
    void teach() {
        super.teach();
        System.out.println("Teaching Mathematics");
    }

    public static void main(String[] args) {
        MathTeacher t = new MathTeacher();
        t.teach();
    }
}
