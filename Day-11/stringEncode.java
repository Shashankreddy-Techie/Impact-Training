package Day11;

import java.util.Scanner;

public class stringEncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        String encodedString = encodeString(str);
        System.out.println("Encoded String: " + encodedString);
        sc.close();
    }
    public static String encodeString(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(ch =='Y' || ch =='y' || ch =='Z' || ch=='z'){
                ch -=26;
            }
            char nextCh = (char)(ch + 3);
            sb.append(nextCh);
        }

        return sb.toString();
    }
}
