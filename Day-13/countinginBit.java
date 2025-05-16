package Day13;

import java.util.Scanner;

public class countinginBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        String ans = toBinary(n);
        System.out.println(ans);
        int oneCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '1') {
                oneCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println("The number of 1's in the binary representation is: " + oneCount);
        System.out.println("The number of 0's in the binary representation is: " + zeroCount);
        sc.close();
    }
    public static String toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}
