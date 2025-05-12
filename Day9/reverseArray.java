package Day9;
import java.util.Scanner;
public class reverseArray {
    public static int[] Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(left < right){
            arr = Swap(arr, left, right);
            left++;
            right--;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
