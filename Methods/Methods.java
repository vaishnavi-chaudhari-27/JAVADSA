package Methods;
import java.util.Scanner;

public class Methods {
    // static void printTwoTables() {
    // for (int i = 1; i <= 10; i++) {
    // int ans = 2 * i;
    // System.out.println("-> " + ans);
    // }
    // }

    // public static void main(String[] args) {
    // System.out.println("Hello");
    // printTwoTables();
    // System.out.println("syeuu");
    // }

    // static void printSum(int x, int y) {
    // System.out.println("SUM: " + (x + y));
    // }
    // public static void main(String[] args) {
    // printSum(7, 4);
    // }

    // Static Methods //
    // static void printWelcome() {
    // System.out.println("Welcome to program");
    // }

    // static int calculateTotal(int solved, int bonus) {
    // return solved + bonus;
    // }

    // static boolean isEligibleForBadge(int streakDays) {
    // return streakDays >= 30;
    // }

    // public static void main(String[] args) {
    // printWelcome();

    // int finalScore = calculateTotal(120, 15);
    // System.out.println("Final Score: " + finalScore);

    // boolean eligible = isEligibleForBadge(35);
    // System.out.println("Badge Eligible: " + eligible);
    // }

    // Method with same names[Method Overloading]//

    // static int add(int a, int b) {
    // return a + b;
    // }

    // static int add(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static void main(String[] args) {
    // System.out.println(add(5, 7));
    // System.out.println(add(5, 7, 9));
    // }

    // Write a func to print your name "N" times//
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n;
    // System.out.println("Enter the value of n");
    // n = sc.nextInt();

    // printName(n);

    // }

    // public static void printName(int n) {
    // for (int i = 1; i <= n; i++) {
    // System.out.println("Vaishu");
    // }

    // Write a function to print the sum from 1 to N//
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n;
    // System.out.println("Enter the value of n");
    // n = sc.nextInt();

    // printSum(n);
    // }

    // public static void printSum(int n) {
    // int sum = 0;
    // for (int num = 1; num <= n; num++) {
    // sum = sum + num;
    // }
    // System.out.println("Printing sum: " + sum);
    // }

    // public static void printName(int n) {
    // for (int i = 1; i <= n; i++) {
    // System.out.println("Vaishu");
    // }

    // }

    // WAF to return the average of 2 number///
    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // int n;

    // double Ans = getAverage(5, 9);
    // System.out.println("Average is: " + Ans);
    // }

    // public static double getAverage(int a, int b) {
    // double avg = (double) (a + b) / 2;
    // return avg;
    // }

    // public static void printSum(int n) {
    // int sum = 0;
    // for (int num = 1; num <= n; num++) {
    // sum = sum + num;
    // }
    // System.out.println("Printing sum: " + sum);
    // }

    // WAF to return minimum of 2 number//
    // public static void main(String[] args) {
    // int mini = getMin(3, 7);
    // System.out.println("Min value is: " + mini);
    // }

    // public static int getMin(int a, int b) {
    // if (a < b)
    // return a;
    // else {
    // return b;
    // }
    // }

    // WAF to return the maximum of 2 number//
    // public static void main(String[] args) {
    // int maxi = getMaxi(5, 4);
    // System.out.println("Maxi Value is: " + maxi);
    // }

    // public static int getMaxi(int a, int b) {
    // if (a > b)
    // return a;
    // else {
    // return b;
    // }
    // }

    // WAF to return the absolute value number///
    // public static void main(String[] args) {
    // int ans = getAbs(7);
    // System.out.println(ans);
    // }

    // public static int getAbs(int number) {
    // if (number >= 0) {
    // return number;
    // } else {
    // return (0 - number);
    // }
    // }

    // WAF to return the exponent of a number//
    public static void main(String[] args) {
        int ans = getPow(5, 4);
        System.out.println(ans);
    }

    public static int getPow(int a, int b) {
        int ans = 1;
        for (int count = 1; count <= b; count++) {
            ans = ans * a;
        }
        return ans;
    }

}
