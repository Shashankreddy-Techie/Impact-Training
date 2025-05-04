package Day2;
import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int digit = 0;
        while(n>0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
