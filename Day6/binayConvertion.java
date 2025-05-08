package Day6;
import java.util.Scanner;
public class binayConvertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert it into binary: ");
        int num = sc.nextInt();
        String result = convertToBinary(num);
        String result2 = convertToOctal(num);
        System.out.println(result);
        System.out.println(result2);
        sc.close();
    }
    private static String convertToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            binary.append(remainder);
            num = num / 2;
        }
        return binary.reverse().toString();
    }
    private static String convertToOctal(int num){
        StringBuilder toOctal = new StringBuilder();
        while(num>0){
            int rem = num % 8;
            toOctal.append(rem);
            num = num / 8;
        }
        return toOctal.reverse().toString();
    }
}
