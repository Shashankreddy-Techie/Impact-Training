package Day15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EliminationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        for(int i=0;i<n;i++){
            if(i%2 != 0){
                arr.remove(i);
                n--;
            }
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
