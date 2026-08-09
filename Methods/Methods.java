package Methods;

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

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 7));
        System.out.println(add(5, 7, 9));
    }
}
