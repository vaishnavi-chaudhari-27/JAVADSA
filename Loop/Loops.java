
public class Loops {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // for (int i = 1; i <= 10; i = i + 1) {
        // System.out.println("Vaishnavi");
        // }

        // for (int i=2; i<=20; i=i+2) {
        // System.out.println(i);
        // }

        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 3; j++) {
        // System.out.println(" i = " + i + " j = " + j);
        // }
        // }

        // for (int i = 1; i <= 10; i++) {
        // if (i == 5) {
        // break;
        // }
        // System.out.println(i);
        // }

        // int i = 1;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // Que 1 print counting 1 to n ///
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }

        // Que 2 print counting from n to 1///
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number ");
        // int n = sc.nextInt();

        // for (int i = n; i >= 1; i--) {
        // System.out.println(i);
        // }

        // Print cou ting from 1 to n//

        // int n = 10;
        // for (int i = 1; i <= n; i = i + 1) {
        // System.out.println(i);
        // }

        // Print couting from n to 1//
        // int n = 1;
        // for (int i=10; i>n; i=i-1){
        // System.out.println(i);
        // }

        // Print the 10 multiples of n//
        // int n = 5;
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i * n);
        // }

        // Print your name 100 times///
        // int n = 100;
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Vaishnavi");
        // }

        // Print all even number 1 to 100//

        // for (int i = 1; i <= i * 2; i = i * 2) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // Print all prime number 1 to 100//

        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }

    }
}