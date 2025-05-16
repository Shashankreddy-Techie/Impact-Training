package Day13;

import java.util.Scanner;

public class positionBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the position :");
        int pos = sc.nextInt();
        String str = toBinary(n);
        String [] arr = str.split("");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-pos){
                System.out.println("The bit at position " + pos + " is : " + arr[i]);
            }
        }
        sc.close();
        /*
         * System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("ENetr the position :");
        int pos = sc.nextInt();
        int num = n & pos;
        System.out.println(num);
         */
    }
    public static String toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}
