package Day20;

import java.util.Scanner;

public class inPlaceSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int mid = 0;
        int right = n - 1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
