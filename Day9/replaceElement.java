package Day9;
import java.util.Scanner;
public class replaceElement {
    public static int[] ReplaceElement(int [] arr){
        int k = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[k] = sum - arr[i];
            k++;
        }
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
        ReplaceElement(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
