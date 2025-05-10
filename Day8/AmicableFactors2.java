package Day8;
import java.util.*;
public class AmicableFactors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int maxnum = Math.max(num1, num2);
        for(int itr=1;itr<=maxnum/2;itr++){
            if(num1%itr==0){
                sum1+=itr;
            }
            if(num2%itr==0){
                sum2+=itr;
            }
        }
        if(sum1==num2 && sum2==num1){
            System.out.println(num1+" and "+num2+" are amicable numbers");
        }else{
            System.out.println(num1+" and "+num2+" are not amicable numbers");
        }
        sc.close();
    }
}
