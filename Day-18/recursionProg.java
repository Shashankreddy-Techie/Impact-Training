package Day18;
import java.util.Scanner;

public class recursionProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        int ans = sumOdDigits(n,sum);
        System.out.println(ans);
        sc.close();
    }
    public static int sumOdDigits(int n,int sum){
        if(n==0){
            return sum;
        }
        int digit = n%10;
        return digit + sumOdDigits(n/10,sum);
    }
}
