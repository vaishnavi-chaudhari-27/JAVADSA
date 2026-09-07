package OOPs.Encapsulation;

public class App {
    // Perfect Encapsulation//

    // STUDENT//
    // public class Student {
    // private String name;
    // private int age;

    // // setter //
    // public void setName(String name) {
    // this.name = name;
    // }

    // // Getter//
    // public String getName() {
    // return name;
    // }

    // // setter //
    // public void setAge(int age) {
    // this.age = age;
    // }

    // // Getter //
    // public int getAge() {
    // return age;
    // }
    // }

    // BANK//
    // public class Bank {
    // private int ATMPIN;
    // private int Account_No;

    // // setter //
    // public void setATMPIN(int ATMPIN) {
    // this.ATMPIN = ATMPIN;
    // }

    // // Getter //
    // public int getATMPIN() {
    // return ATMPIN;
    // }

    // // setter //
    // public void setAccount_No(int Account_No) {
    // this.Account_No = Account_No;
    // }

    // // Getter //
    // public int getAccount_No() {
    // return Account_No;
    // }

    // }

    // ACCOUNT//
    // class Account {
    // private double balance; // private variable

    // // setter method//
    // public void setBalance(double balance) {
    // if (balance >= 0) {
    // this.balance = balance;
    // } else {
    // System.out.println("Error: Negative balance not allowed.");
    // }
    // }

    // // getter method //
    // public double getBalance() {
    // return balance;
    // }

    // }

    // EMPLOYEE//
       public static void main(String[] args) {
   
           Employee e = new Employee();
   
           e.setName("Vaishu");
           System.out.println("Employee Name: " + e.getName());
   
           e.setSalary(15000);
           System.out.println("Employee Salary: " + e.getSalary());
       }
   }


    // Attributes//
    // public int id;
    // public int age;
    // public String name;
    // public int nos;

    // Default constructor//
    // public Student() {
    // System.out.println("Student Default ctor called");
    // }

    // Patameterised ctor//
    // public Student(int id, int age, String name, int nos) {
    // System.out.println("Student parameterised ctor called");
    // this.id = id;
    // this.age = age;
    // this.name = name;
    // this.nos = nos;
    // }

    // Copy ctor//
    // public Student(Student srcobj) {
    // System.out.println("Student Copy ctor Called");
    // this.id = srcobj.id;
    // this.age = srcobj.age;
    // this.name = srcobj.name;
    // this.nos = srcobj.nos;
    // }

    // Methods / Behaviours//
    // public void study() {
    // System.out.println(name + " Studying");
    // }

    // public void sleep() {
    // System.out.println(name + " sleeping");
    // }

    // public void bunk() {
    // System.out.println(name + " Buking");
    // }
    // }


