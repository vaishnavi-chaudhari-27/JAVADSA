public class Main {
    // Print each character of the string//
    // public static void main(String[] args) {

    // String str = "Vaishu";

    // for (int i = 0; i < str.length(); i++) {
    // System.out.println(str.charAt(i));
    // }

    // Count Length Without length()//
    // String str = "Java";
    // int count = 0;
    // for (int i = 0; i < str.length(); i++) {
    // count++;
    // }
    // System.out.println(count);

    // Count vowels in a String//
    // static int getVowelsCount(String str) {
    // int count = 0;

    // str = str.toLowerCase();

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);

    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // count++;
    // }
    // }
    // return count;
    // }

    // public static void main(String[] args) {
    // String str = "LOVE";
    // System.out.println(getVowelsCount(str));
    // }

    // Reverse a String//
    // static String reverseString(String str) {
    // String reverse = "";
    // int n = str.length();
    // for (int i = n - 1; i >= 0; i--) {
    // char ch = str.charAt(i);
    // reverse = reverse + ch;
    // }
    // return reverse;
    // }

    // public static void main(String[] args) {
    // String st = "VAISHU";
    // System.out.println(reverseString(st));
    // }

    // Check String is a paalindrom or not///
    static boolean isPalindroms(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindroms(str));
    }
}
