class Calculator {
    // int add(int a, int b) {
    // return a + b;
    // }

    // int add(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static void main(String[] args) {
    // Calculator obj = new Calculator();

    // System.out.println(obj.add(10, 20));
    // System.out.println(obj.add(20, 30, 40));
    // }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10.5, 20.5);
        c.add(10, 20, 30);
    }
}