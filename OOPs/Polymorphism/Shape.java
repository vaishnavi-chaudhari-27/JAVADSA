class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}