package Day4;
import java.util.Scanner;

public class powerChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a power of 2:");
        int num = sc.nextInt();
        sc.close();
        if (num <= 0) {
            System.out.println("NO");
        } else {
            while (num > 1) {
                if (num % 2 != 0) {
                    System.out.println("NO");
                    return; 
                }
                num /= 2;
            }
            System.out.println("YES");
        }
    }
}