package Day2;
import java.util.Scanner;
public class countofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n /= 10; 
            count++; 
        }
        System.out.println("Count of digits: " + count);
        sc.close();
    }
}
