package Day16;

import java.util.Scanner;

public class waveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }
                else{
                    System.out.print(arr[n-j-1][i]+" ");
                }
            }
        }
        sc.close();
    }
}
