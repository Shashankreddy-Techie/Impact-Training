package Day6;
import java.util.Scanner;
import java.math.*;
public class divofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number :");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while( temp != 0){
            int dig = temp % 10;
            count++;
            temp = temp / 10;
        }
        int pow =(int) Math.pow(10, count - 1);
        int flag = 0;
        while( pow != 0){
            int dig = num / pow;
            // if(dig == 0 || dig == 1){
            //     continue;
            // }
            if( num % dig == 0){
                System.out.println(dig);
                flag = 1;
            }
            pow = pow / 10;
            num = num % pow;
        }
        if(flag == 0){
            System.out.println("-1");
        }
        
    }
}
