package Day15;

import java.util.Scanner;

public class maxOddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string:");
        String str = sc.nextLine();
        String res = MaxOddBin(str);
        System.out.println(res);
        sc.close();
    }
    public static String MaxOddBin(String str){
        int n = str.length();
        int ones = 0;
        int zeroes = 0;
        String ans = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '1'){
                ones += 1;
            }else{
                zeroes += 1;
            }
        }
        for(int i=0;i<ones-1;i++){
            ans += "1";
        }
        for(int i=0;i<zeroes;i++){
            ans += "0";
        }
        ans += "1";
        return ans;
    }
}

  