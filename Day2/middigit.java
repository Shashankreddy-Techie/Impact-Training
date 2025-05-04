package Day2;
import java.util.Scanner;
public class middigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp /= 10; 
            count++; 
        }
        int middleIndex = count / 2;
        int middleDigit = 0;
        for (int i = 0; i <= middleIndex; i++) {
            middleDigit = n % 10; 
            n /= 10; 
        }
        System.out.println("Middle digit: " + middleDigit);
        sc.close();
    }
}
