package Day4;
import java.util.Scanner;
public class sumofNOddnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num*2;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
