class Employee {
    void calculateSalary() {
        System.out.println("Emmployee Salary");
    }

    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();

    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: 5000");
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: 40000");
    }
}
