package Day8;
import java.util.*;
public class Arrays1 {
    public static void counting(int arr[], int n){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroCount++;
            }else{
                oneCount++;
            }
        }
        System.out.println("Count of 0s: "+zeroCount);
        System.out.println("Count of 1s: "+oneCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        counting(arr, n);
    }
}
