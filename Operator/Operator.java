
public class Operator {
    public static void main(String[] args) {
        // Arithmetic //
        // int num1 = 30;
        // int num2 = 20;
        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // System.out.println(num1 % num2);

        // // relational //
        // int a = 10;
        // int b = 20;
        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);
        // System.out.println(a == b);
        // System.out.println(a != b);

        // // logical ///
        // int x = 10;
        // int y = 20;
        // int z = 30;
        // boolean cond1 = false;
        // boolean cond2 = (y < z);
        // boolean cond3 = (x < z);

        // boolean answer1 = (cond1 && cond2 && cond3);
        // System.out.println(answer1);
        // boolean answer2 = (cond1 || cond2 || cond3);
        // System.out.println(answer2);
        // boolean answer3 = (!cond1);
        // System.out.println(answer3);

        // // assignment///
        // int age = 12;

        // // age = age + 8
        // age += 9;
        // System.out.println(age);

        // // age = age - 1;
        // age -= 2;
        // System.out.println(age);

        // // age = age * 10;
        // age *= 10;
        // System.out.println(age);

        // // age = age / 10;
        // age /= 20;
        // System.out.println(age);

        // age = age % 5;
        // System.out.println(age);

        // // unary //
        // int value = 8;
        // System.out.println(value++);
        // System.out.println(value);

        // Q1. Even or Odd
        int n = 17;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Q2. Positive, Negative or Zero
        int a = -10;
        if (a > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Q3. Find Greatest of Two Numbers
        int x = 20;
        int y = 35;
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        // two numbers value print//
        int num1 = 20;
        int num2 = 30;

        int sum = num1 + num2;
        System.out.println(sum);

        int sub = num1 - num2;
        System.out.println(sub);

        int multi = num1 * num2;
        System.out.println(multi);

        double div = (double)num1 / num2;
        System.out.println(div);

        // Student marks//

        int marks = 50;
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }
    }
}
