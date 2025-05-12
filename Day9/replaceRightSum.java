package Day9;
import java.util.Scanner;
public class replaceRightSum {
    public static int[] ReplaceRightElementSum(int [] arr){
        int k = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];
            }
            arr[k] = sum;
            sum=0;
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
        ReplaceRightElementSum(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
