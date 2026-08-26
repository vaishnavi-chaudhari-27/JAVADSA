// package Methods;

public class FunctionArray {

    // Print the array//
    // public static void main(String[] args) {
    // int arr[] = { 10, 20, 30, 40, 50 };
    // printArray(arr);
    // }

    // public static void printArray(int arr[]) {
    // for (int element : arr) {
    // System.out.println(element);
    // }
    // }

    // WAF to return the sum of all element in the array//
    // public static void main(String[] args) {
    // int arr[] = { 10, 20, 30, 40, 50 };
    // int ans = getSum(arr);
    // System.out.println(ans);
    // }

    // public static int getSum(int arr[]) {
    // int sum = 0;
    // for (int element : arr) {
    // sum = sum + element;
    // }
    // return sum;
    // }

    // WAF to double the value present inside the array//
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Before");
        printArray(arr);

        doubleArrayValues(arr);

        System.out.println("After");
        printArray(arr);
    }

    public static void doubleArrayValues(int arr[]) {
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            arr[index] = 2 * arr[index];
        }
    }

    public static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
