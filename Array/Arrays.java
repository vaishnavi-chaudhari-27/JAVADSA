package Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // decaration
        // int arr[];
        // // allocation
        // arr = new int[5];
        // // init
        // int n=3;
        // int brr[] = { 10, 20, 30 };
        // for (int index = 0; index <= n - 1; index++) {
        // System.out.println(brr[index]);
        // }
        // // System.out.println("Value at 0 index " + brr[0]);
        // // System.out.println("Value at 0 index " + brr[1]);
        // // System.out.println("Value at 0 index " + brr[2]);

        // int arr[] = new int[6];
        // Scanner sc = new Scanner(System.in);
        // int n = arr.length;

        // for (int i = 0; i <= n - 1; i++) {
        // System.out.println("Provide input for index: " + i);
        // arr[i] = sc.nextInt();
        // }

        // System.out.println("You are array contains: ");
        // for (int val : arr) {
        // System.out.println(val);
        // }

        // Addition//
        // int arr[] = { 10, 20, 30, 40, 50 };
        // int sum = 0;
        // int n = arr.length;

        // for (int i = 0; i <= n - 1; i++) {
        // int value = arr[i];
        // sum = sum + value;
        // }
        // System.out.println(sum);

        // multiplication//
        // int arr[] = { 20, 10, 30, 15 };
        // int ans = 1;
        // int n = arr.length;

        // for (int i = 0; i <= n - 1; i++) {
        // int value = arr[i];
        // ans = ans * value;
        // }
        // System.out.println(ans);

        // maximum value//
        // int arr[] = { 3, 2, -5, 21, 10 };
        // int n = arr.length;
        // int maxValue = arr[0];

        // for (int i = 0; i <= n - 1; i++) {
        // if (arr[i] > maxValue) {
        // maxValue = arr[i];
        // }
        // }
        // System.out.println(maxValue);

        // minimum value//
        // int arr[] = { 3, 5, 4, 2, -6, 8 };
        // int n = arr.length;
        // int miniValue = arr[0];

        // for (int i = 0; i <= n - 1; i++) {
        // if (arr[i] < miniValue) {
        // miniValue = arr[i];
        // }
        // }
        // System.out.println(miniValue);

        // 2D array//

        // int[][] arr;
        // arr = new int[3][4];
        // int[][] brr = {
        // { 1, 2 },
        // { 2, 3 },
        // { 3, 4 },
        // { 4, 5 }
        // };

        // int rowLength = brr.length;
        // int colLength = brr[0].length;

        // for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
        // for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
        // System.out.print(brr[rowIndex][colIndex] + " ");
        // }
        // System.out.println();
        // }

        // int[][] arr;
        // arr = new int[3][4];
        // int[][] brr = {
        // { 1, 2 },
        // { 2, 3, 5, 7 },
        // { 3, 4, 3, 7, 8 },
        // { 4 }
        // };

        // int rowLength = brr.length;
        // // int colLength = brr[0].length;

        // for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
        // int colLength = brr[rowIndex].length;
        // for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
        // System.out.print(brr[rowIndex][colIndex] + " ");
        // }
        // System.out.println();
        // }

        // problem 1 print matrix//
        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Que 2 Find sum of all values in array//
        // int size;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Size Of Array: ");
        // size = sc.nextInt();

        // int arr[] = new int[size];

        // for (int count = 1; count <= size; count++) {
        // int index = count - 1;
        // System.out.println("Enter The Value Of index: " + index);
        // arr[index] = sc.nextInt();
        // }
        // int sum = 0;
        // for(int num: arr){
        // sum = sum + num;
        // }
        // System.out.println("Total Sum: " + sum);

        // Find minimum vaalue in array//
        // int arr[] = {100, 50,20,150,-5,250,-50,12,16};
        // int mini = Integer.MAX_VALUE;
        // for(int num: arr){
        // if(num < mini){
        // mini = num;
        // }
        // }
        // System.out.println("Minimum number is: " + mini);

        // Find maximumm vaalue in array//
        int arr[] = { 100, 50, 20, 150, -5, 250, -50, 12, 16 };
        int maxi = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxi) {
                maxi = num;
            }
        }
        System.out.println("Maximum number is" + maxi);
    }
}
