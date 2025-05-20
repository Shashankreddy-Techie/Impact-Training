package Day16;

import java.util.Scanner;

public class Array2D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array :");
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        SwapRows(arr);
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        SwapColumns(arr);
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void SwapRows(int[][] arr) {
        int[] temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        /*
         * Here iam swapping directly the rows of the array not row&column;
         */
    }
    public static void SwapColumns(int[][]arr){
        for(int col=0;col<arr[0].length;col++){
            int temp = arr[col][0];
            arr[col][0] = arr[col][arr[0].length-1];
            arr[col][arr[0].length-1] = temp;
        }
    }
}
