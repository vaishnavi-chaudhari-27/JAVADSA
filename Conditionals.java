import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // if-statement //
        // int dailypractice = 12;
        // if (dailypractice >= 10) {
        // System.out.println("Good consistency");
        // }

        // int age = 21;
        // if (age >= 18) {
        // System.out.println("You are eligible for voting");
        // }

        // if-else statement //

        // int CGPA = 10;
        // if (CGPA >= 7.99) {
        // System.out.println("Pass");
        // } else {
        // System.out.println("Fail");
        // }

        // if-else-if ladder //

        // int accurancy = 78;

        // if (accurancy >= 90) {
        // System.out.println("Excellent");
        // } else if (accurancy >= 75) {
        // System.out.println("Good");
        // } else if (accurancy >= 60) {
        // System.out.println("Average");
        // } else {
        // System.out.println("Needs Improvement");
        // }

        // int color = 7;

        // if (color == 1) {
        // System.out.println("pink");
        // } else if (color == 2) {
        // System.out.println("red");
        // } else if (color == 3) {
        // System.out.println("yellow");
        // } else if (color == 4) {
        // System.out.println("black");
        // } else {
        // System.out.println("purple");
        // }
        // System.out.println("Not a Color Available");

        // Nested if-else //

        // int age = 18;
        // char gender = 'F';

        // if (gender == 'M') {
        // System.out.println("You are a Male");
        // if (age > 18) {
        // System.out.println("You are Male and age > 18");
        // } else {
        // System.out.println("You are Male and age <= 18");
        // }
        // } else {
        // System.out.println("You are not a Male");
        // if (age > 18) {
        // System.out.println("You are not a Male and age > 18");
        // } else {
        // System.out.println("You are not a Male and age <= 18");
        // }
        // }

        // Ternary operator //
        // int age = 10;
        // int ans = (age > 18) ? 22 : 12;
        // System.out.println("Ans: " + ans);

        // Switch statement //
        // System.out.println("Enter the value for day");
        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();

        // switch (day) {
        // case 1:
        // System.out.println("Monday");

        // case 2:
        // System.out.println("Tues");

        // case 3:
        // System.out.println("Wed");

        // case 4:
        // System.out.println("Thurs");

        // case 5:
        // System.out.println("Fri");

        // case 6:
        // System.out.println("Sat");

        // default:
        // System.out.println("Sunday");
        // }

        // practice question 1 //
        // Take age input and print if he/she is eligible to vote or not//

        // System.out.println("Enter your Age");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("She is eligible to vote");
        // } else {
        // System.out.println("She is not eligible to vote");
        // }

        // practice que 2//
        // Take input 5 subject's marks and print the overall percentage of student//

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter marks of subject 1: ");
        // int s1 = sc.nextInt();

        // System.out.println("Enter marks of subject 2: ");
        // int s2 = sc.nextInt();

        // System.out.println("Enter marks of subject 3: ");
        // int s3 = sc.nextInt();

        // System.out.println("Enter marks of subject 4: ");
        // int s4 = sc.nextInt();

        // System.out.println("Enter marks of subject 5: ");
        // int s5 = sc.nextInt();

        // int total = s1 + s2 + s3 + s4 + s5;
        // double percentage = (total / 500.0) * 100;

        // System.out.println("Total Marks = " + total);
        // System.out.println("percentage = " + percentage + "%");

        // practice set 3 //
        // Take input a lowercase character and print its upercase version//

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a lowercase character: ");
        // char ch = sc.next().charAt(0);

        // char upper = Character.toUpperCase(ch);

        // System.out.println("Uppercase character: " + upper);

        // Take input a uppercase character and print its lowercase version //
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a uppercase character: ");
        // char ch = sc.next().charAt(0);

        // char lower = Character.toLowerCase(ch);
        // System.out.println("lowercase character: " + lower);

        // Que4 Check whether a number is positive or negative.//
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if (num > 0) {
        // System.out.println("Positive Number");
        // } else if (num < 0) {
        // System.out.println("Negative Number");
        // } else {
        // System.out.println("Zero");
        // }

        // Que 5 Even and odd number //
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("Even number");
        // } else {
        // System.out.println("Odd number");
        // }

        // Que 6 //
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("Eligible to vote");
        // } else {
        // System.out.println("Not eligible too vote");
        // }

        // Que 7 largest two nummber //
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int num2 = sc.nextInt();
        // if(num1 > num2) {
        // System.out.println(num1 + "is greater");
        // } else {
        // System.out.println(num2 + "is greater");
        // }

        // Que 8 largest three number//

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First Number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the Second Number: ");
        // int num2 = sc.nextInt();
        // System.out.println("Enter the three Number: ");
        // int num3 = sc.nextInt();
        // if (num1 > num2) {
        // System.out.println(num1 + " is greater ");
        // } else if (num2 > num3) {
        // System.out.println(num2 + " is greater");
        // } else {
        // System.out.println(num3 + " is greater");
        // }

        // Que 9 print grades based on marks A, B, C, Fail//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        if (marks >= 80) {
            System.out.println("The grade of Marks A");
        } else if (marks >= 65) {
            System.out.println("The Grade of Marks B");
        } else if (marks >= 45) {
            System.out.println("The Grade of Marks C");
        } else {
            System.out.println("Sorry you are a Fail");
        }
    }

}