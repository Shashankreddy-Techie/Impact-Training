package Day16;

import java.util.Scanner;

public class ShiftColums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ColumnShifter(arr);
        System.out.println("After shifting the columns");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void ColumnShifter(int [][] arr){
        for(int i=0;i<arr[0].length;i++){
            int temp = arr[0][i];
            arr[0][i] = arr[i][arr.length-1];
            arr[i][arr.length-1] = temp;
        }
    }
}
