package Day15;

import java.util.Scanner;

public class xorOfArrayelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] ans = xorOfArray(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
    public static int[] xorOfArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            int dig = arr[i] ^ arr[i-1];
            ans[i] = dig;
        }
        return ans;
    }
}
