public class BasicMaths {
    // Que 1 print digits of a number //
    // static void printDigits(int num) {
    // while (num != 0) {
    // int digit = num % 10;
    // System.out.println(digit);
    // num = num / 10;
    // }
    // }
    // public static void main(String[] args) {
    // int num = 53122;
    // printDigits(num);
    // }

    // Que 2 count digits of a number//
    // public static void main(String[] args) {
    // int num = 12345;
    // int count = 0;
    // while (num > 0) {
    // count++;
    // num = num / 10;
    // }
    // System.out.println(count);
    // }

    // Que 3 Sum of digit number ///
    // static int sumOfDigits(int num) {
    // int sum = 0;
    // while (num != 0) {
    // int digit = num % 10;
    // sum = sum + digit;
    // num = num / 10;
    // }
    // return sum;
    // }

    // public static void main(String[] args) {
    // int num = 45673;
    // int sum = sumOfDigits(num);
    // System.out.println("Sum Of Digits: " + sum);
    // }

    // Que 4 Reverse a number //

    // static int reverseNum(int num) {
    // int reverse = 0;

    // while (num != 0) {
    // int digit = num % 10;
    // reverse = reverse * 10 + digit;
    // num = num / 10;
    // }
    // return reverse;
    // }

    // public static void main(String[] args) {
    // int num = 12454;
    // int reverse = reverseNum(num);
    // System.out.println(reverse);
    // }

    // Que 5 Palindrome number ///
    // static int reverseNum(int num) {
    // int reverse = 0;
    // while (num > 0) {
    // int lastDigit = num % 10;
    // reverse = reverse * 10 + lastDigit;
    // num = num / 10;
    // }
    // return reverse;
    // }

    // static boolean isPalindrome(int num) {
    // int originalNum = num;
    // int reverseNum = reverseNum(num);
    // if (originalNum == reverseNum) {
    // System.out.println("It is a palindrome");
    // return true;

    // } else {
    // System.out.println("It is not palindrome");
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // boolean ans = isPalindrome(1223221);
    // System.out.println(ans);

    // Que 6 Prime Number//
    // static boolean isPrimeOrNot(int num) {
    // for (int i = 2; i <= num - 1; i++) {
    // if (num % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // int num = 17;
    // System.out.println(isPrimeOrNot(num));
    // }

    // GCD of a number (Gretest common divisor)//
    // static int getGCD(int a, int b) {
    // gcd(a,b) = gcd(b, a%b);//
    // while (b != 0) {
    // int olfValueOfb = b;
    // b = a % b;
    // a = olfValueOfb;
    // }
    // int ans = a;
    // return ans;
    // }

    // public static void main(String[] args) {
    // System.out.println(getGCD(13, 34));
    // }

    // LCM of a number//
    // public static void main(String[] args) {
    // int a = 12;
    // int b = 18;

    // int x = a;
    // int y = b;

    // while (y != 0) {
    // int temp = y;
    // y = x % y;
    // x = temp;
    // }
    // int gcd = x;
    // int lcm = (a * b) / gcd;

    // System.out.println("LCM = " + lcm);
    // }

    // Armstrong number//
    // public static void main(String[] args) {
    // int n = 153;
    // int original = n;
    // int sum = 0;

    // while (n > 0) {
    // int digit = n % 10;
    // sum = sum + (digit * digit * digit);
    // n = n / 10;
    // }

    // if (sum == original) {
    // System.out.println("Armstrong Number");
    // } else {
    // System.out.println("Not Armstrong Number");
    // }
    // }

    // Find divisors or check perfect number//
    // static boolean checkPerfectNum(int num) {
    // int sum = 1;
    // for (int i = 2; i * i <= num; i++) {
    // if (num % i == 0) {
    // int firstFactor = i;
    // int secondFactor = num / i;
    // sum = sum + firstFactor + secondFactor;
    // }
    // }
    // if (sum == num) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // System.out.println(checkPerfectNum(6));
    // }

    // print all prime from to n///
    // public static void main(String[] args) {
    // int n = 20;

    // for (int num = 2; num <= n; num++) {
    // boolean isPrime = true;

    // for (int i = 2; i * i <= num; i++) {
    // if (num % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // if (isPrime) {
    // System.out.println(num + " ");
    // }
    // }
    // }

    // Power of a number //
    // public static void main(String[] args) {
    // int a = 2;
    // int b = 5;
    // int ans = 1;

    // for (int i = 1; i <= b; i++) {
    // ans = ans * a;
    // }
    // System.out.println("Power = " + ans);
    // }

    // Perfect Number //
    // public static void main(String[] args) {
    // int n = 6;
    // int sum = 0;
    // for (int i = 1; i < n; i++) {
    // if (n % i == 0) {
    // sum = sum + i;
    // }
    // }
    // if (sum == n) {
    // System.out.println("Perfect Number");
    // } else {
    // System.out.println("Not Perfect number");
    // }
    // }

    // Count number of even digit////
    public static void main(String[] args) {
    int n = 248531;
    int count = 0;

    while (n > 0) {
    int digit = n % 10;
    if (digit % 2 == 0) {
    count++;
    }
    n = n / 10;
    }
    System.out.println("Even digits count = " + count);
    }
}
