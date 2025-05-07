package Day5;
import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int num = n;
        sc.close();
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum += dig;
            n = n/10;
        }
        if(num %sum == 0){
            System.out.println("The number is a Harshad Number.");
        } else {
            System.out.println("The number is not a Harshad Number.");
        }
    }
}