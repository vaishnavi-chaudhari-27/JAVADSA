class Area {
    void area(int side) {
        System.out.println(side * side);
    }

    void area(int length, int breadth) {
        System.out.println(length * breadth);
    }

    void area(double radius) {
        System.out.println(Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.area(5);
        obj.area(6,7);
        obj.area(5.0);
    }
}

