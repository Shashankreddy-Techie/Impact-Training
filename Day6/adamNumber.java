package Day6;
import java.util.Scanner;
import java.math.*;

public class adamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int numSqr = num * num;
        int revNum = reverse(num);
        int revNumSqr = revNum * revNum;
        int revofRevNumSqr = reverse(revNumSqr);
        if(numSqr == revofRevNumSqr){
            System.out.println(num + " is an Adam Number.");
        }else{
            System.out.println(num + " is not an Adam Number.");
        }
    }
    private static int reverse(int num){
        int revNum = 0;
        while( num!=0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
    }
}
