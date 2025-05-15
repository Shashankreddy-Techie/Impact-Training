import java.math.BigInteger;
import java.util.Scanner;
public class addStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter the string 2:");
        String s2 = sc.nextLine();
        String res = StringAdder(s1, s2);
        System.out.println(res);
        sc.close();
    }
    public static String StringAdder(String s1, String s2){
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger result = b1.add(b2);
        return result.toString();
    }
}
