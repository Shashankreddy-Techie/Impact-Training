package Day18;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class diagonalArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        DiagonalTraversal(arr, n, m);
    }

    public static void DiagonalTraversal(int[][] arr, int n, int m) {
        List<Integer> list = new ArrayList<>();
        int row = 0;
        int col = 0;
        boolean up = true;
        while(row<n && col<m){
            if(up){
                while(row>0 && col<m-1){
                    list.add(arr[row][col]);
                    row--;
                    col++;
                }
                list.add(arr[row][col]);
                if(col==m-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(col>0 && row<n-1){
                    list.add(arr[row][col]);
                    row++;
                    col--;
                }
                list.add(arr[row][col]);
                if(row==n-1){
                    col++;
                }else{
                    row++;
                }
            }
            up = !up;
        }
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
