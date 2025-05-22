package Day18;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        printFibonacciSeries(n, 0, 1);
        sc.close();
    }

    public static void printFibonacciSeries(int n, int a, int b) {
        if (n <= 0) {
            return;
        }
        System.out.print(a + " "); 
        printFibonacciSeries(n - 1, b, a + b);
    }
}
