package Day13;

import java.util.Scanner;

public class bitMultiplicationandDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        bitManupulate(n);
        sc.close();
    }
    public static void bitManupulate(int n) {
        int mul = n << 1;
        System.out.println(mul);
        int div = n >> 1;
        System.out.println(div);
    }
}
