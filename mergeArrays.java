package Day9;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class mergeArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i : arr1) {
            list.add(i);
        }
        for(int i : arr2) {
            list.add(i);
        }
        Collections.sort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
