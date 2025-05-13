package Day10;
import java.util.Scanner;
public class insertingElement {
    public static void InsertElement(int arr[], int element) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
    }
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
        int element = sc.nextInt();
        int k = 0;
        InsertElement(arr, element);
        arr[k] = element;
        System.out.println("The array after inserting the element is");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
