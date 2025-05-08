package Day6;
import java.util.Scanner;

public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        boolean str = isHappy(n, sum);
        if (str) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }
    }
    public static boolean isHappy(int n, int sum) {
        int num = n;
        while(num !=0){
            int dig = num % 10;
            sum += dig * dig;
            num = num / 10;
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            }
        } 
        return isHappy(sum, 0);       
    }
}
