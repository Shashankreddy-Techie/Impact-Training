package Day16;

import java.util.Scanner;

public class ShiftArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ShifterArray(arr);
        System.out.println("After shifting the array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void ShifterArray(int[][] arr) {
        int[] temp = arr[arr[0].length-1];
        for(int i=arr[0].length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
