public class Multi {
    public static void main(String[] args) {
        int arr[][] = {
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 2, 3, 4 },
        };

        int rowSize = arr.length;
        int colSize = arr[0].length;

        int sum = 0;
        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (int colIndex = 0; colIndex < colSize; colIndex++) {
                sum = sum + arr[rowIndex][colIndex];
            }
        }
        System.out.println("Overall summ: " + sum);
        // for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
        // for (int colIndex = 0; colIndex < colSize; colIndex++) {
        // System.out.print(arr[rowIndex][colIndex] + " ");
        // }
        // System.out.println();
        // }

        // for (int[] temp : arr) {
        // for (int num : temp) {
        // System.out.println(num);
        // }
        // }

    }
}
