package Day5;
import java.util.Scanner;
public class countingTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        long num = sc.nextLong();
        System.out.println("Enter a Target Digit :");
        int target = sc.nextInt();
        int count = 0;
        while(num>0){
            int dig = (int) (num%10);
            if(dig == target){
                count++;
            }
            num = num/10;
        }
        System.out.println("The target digit "+target+" occurs "+count+" times.");
        sc.close();
    }
}
