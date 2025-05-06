package Day4;
import java.util.Scanner;
public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(sum>=10){
            int sum1 = 0;
            while (sum>0){
                int digit = sum % 10;
                sum1 += digit;
                sum /= 10;
            }
            System.out.println("Sum of digits is:" + sum1);
        }
        sc.close();
    }
}