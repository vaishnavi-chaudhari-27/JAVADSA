package OOPs.Encapsulation;

public class Employee {
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Invalid Salary");
        } else {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }
}

