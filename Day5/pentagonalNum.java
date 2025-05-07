package Day5;
import java.util.Scanner;
public class pentagonalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int diff = 4;
        int gen = 5;
        if(n == 1 || n == 5){
            System.out.println(n+" is a pentagonal number.");
        }else{
            while(gen <= n){
                diff += 3;
                gen += diff;
                if(gen == n){
                    System.out.println(n + " is a pentagonal number.");
                    return;
                }else{
                    if(gen > n){
                        System.out.println(n + " is not a pentagonal number.");
                        return;
                    }
                }
            }
        }
    }
}
