package Day16;

import java.util.Scanner;

public class MirrorArray {
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
        sc.close();
        ArrayMirror(arr,n,m);
        System.out.println("After mirroring the array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ArrayMirror(int[][] arr, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][m-j-1];
                arr[i][m-j-1] = temp;
            }
        }
    }
}
