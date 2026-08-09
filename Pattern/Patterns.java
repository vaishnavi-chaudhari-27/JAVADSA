package Pattern;

public class Patterns {
      // Solid Square patt//
        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid rectangle pattern//
        // int n = 3;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= 5; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid right angle triangle//
        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for each row -> variable col//
        // formula -> col -> 1 -> value of row//
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid rohmbus pattern///

        // int n = 5;

        // for (int r = 1; r <= n; r++) {
        // for each row -> spaces, stars //

        // spaces//
        // for (int c = 1; c <= n - r; c++) {
        // System.out.print(" ");
        // }

        // Stars//

        // for (int c = 1; c <= n; c++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Inverted right angle triangle//
        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid pyramid pattern//
        // int n = 5;

        // for (int row=1; row<=n; row++) {
        // for (int col=1; col<=n-row; col++) {
        // System.out.print(" ");
        // }
        // for (int col=1; col<=2*row-1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Inverted pyramid//

        // int n = 4;
        // for (int row=1; row<=n; row++) {
        // for (int col=1; col<=row-1; col++) {
        // System.out.print(" ");
        // }

        // for (int col=1; col<=2*n-2*row+1; col++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }

        // Hollow rectangle patt//
        // int n = 10;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= 6; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // }
        // else {
        // if (col == 1 || col==6) {
        // System.out.print("* ");
        // }
        // else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // Hollow right angle triangle///

        // int n = 10;
        // for (int row = 1; row <= n; row++) {
        // if (row == 1 || row == 2 || row == n) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // } else {
        // System.out.print("* ");
        // for (int col = 1; col <= (row - 2); col++) {
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // hollow rectangle patte// bakii

        // int n=5;
        // for(int row=1; row<=n; row++){
        // // part 1
        // for(int col=1; col<=n-row; col++){
        // System.out.print(" ");
        // }
        // // part 2
        // if(row==1 || row==n){
        // for(int col=1; col<=2*row-1; col++) {
        // System.out.print("* ");
        // }
        // }
        // else {
        // System.out.print("* ");
        // for(int col=1; col<=2*row-3; col++){
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid diamond pattern///
        // Solid Diamond Pattern
        // int m = 5;

        // Upper Half///
        // for (int row = 1; row <= m; row++) {

        // for (int col = 1; col <= m - row; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // Lower Half//
        // for (int row = m - 1; row >= 1; row--) {

        // for (int col = 1; col <= m - row; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // Butterfly pattern//

        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // // part 1 //
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // // part 2//
        // for (int col = 1; col <= 2 * (n - row); col++) {
        // System.out.print(" ");
        // }
        // // part 3//
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // inverted symmetrical half//
        // for (int row = 1; row <= n; row++) {
        // // part4 //
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("* ");
        // }
        // // part 5//
        // for (int col = 1; col <= 2 * (row - 1); col++) {
        // System.out.print(" ");
        // }
        // // part 6//
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(col + " ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int count = 1;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(count + " ");
        // count++;
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // int a = col;
        // int b = ('A' - 1);
        // int ans = a + b;
        // char finalAns = (char) ans;
        // System.out.print(finalAns + " ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // int a = n - col;
        // int b = 'A';
        // int ans = a + b;
        // char finalAns = (char) ans;
        // System.out.print(finalAns + " ");
        // }
        // System.out.println();
        // }

        public static void main(String[] args) {
            int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "  ");
            }
            int decRowValue = row-1;
            for(int col=1; col<=row-1; col++){
                System.out.print(decRowValue + "  ");
                decRowValue--;
            }
               System.out.println();
            }
   
        }
        }

