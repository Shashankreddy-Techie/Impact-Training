package Day10;
import java.util.*;
public class uniquePosiInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be inserted");
        int ele = sc.nextInt();
        System.out.println("Enter the position to insert the element");
        int pos = sc.nextInt();
        UniqueInsertion(arr, ele, pos);
        sc.close();
    }
    public static void UniqueInsertion(int arr[], int ele, int pos){
        int n = arr.length;
        for(int i = n-1;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;
        System.out.println("The array after inserting the element is");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}