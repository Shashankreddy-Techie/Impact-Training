package Day17;

import java.util.Scanner;

public class ArrayDirections{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter the elements of array :");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        DirectionIndex(arr,n,m);
        sc.close();
    }
    public static void DirectionIndex(int[][] arr,int n, int m){
        int idx = 0;
        int jdx = 0;
        int dir = 0;
        while(idx>=0 && idx < n && jdx>=0 && jdx < m){
            dir = (dir+arr[idx][jdx]) % 4;
            if(dir==0){
                jdx++;
            }else if(dir==1){
                idx++;
            }else if(dir==2){
                jdx--;
            }else if(dir==3){
                idx--;
            }if(idx<0){
                idx++;
                break;
            }else if(jdx<0){
                jdx++;
                break;
            }else if(idx==arr.length){
                idx--;
                break;
            }else if(jdx==arr[0].length){
                jdx--;
                break;
            }
        }
        System.out.println(idx+" , "+ jdx);
    }
}
