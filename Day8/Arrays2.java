package Day8;
import java.util.*;
public class Arrays2 {
    public static void majority(int arr[], int n){
        for(int i :  arr){
            int count = 1;
            for(int j=0;j<n;j++){
                if(i != j && arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > n/2){
                System.out.println("Majority element is: " + arr[i]);
                return;
            }else{
                System.out.println("No majority element");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        majority(arr, n);
        sc.close();
    }
}
