package Day18;

import java.util.Scanner;

public class duplicateRemaove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String result = removDuplicates(str);
        System.out.println(result);
        sc.close(); ,
    }
    public static String removDuplicates(String str){
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return removDuplicates(str.substring(1));
        } else {
            return str.charAt(0) + removDuplicates(str.substring(1));
        }
    }
}
