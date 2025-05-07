package Day5;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        // Calculate the sum of the digits
        while (n != 0) {
            int dig = n % 10;
            sum += dig;
            n = n / 10;
        }

        // Check if the sum of the digits is a single digit
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                int dig = temp % 10;
                sum += dig;
                temp = temp / 10;
            }
        }

        // A number is a magic number if the final sum of digits is 1
        if (sum == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
        sc.close();
    }
}
