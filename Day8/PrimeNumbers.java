package Day8;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors:");
        int num = sc.nextInt();
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for(int itr=1 ; itr <= sqrt ; itr++){
            if(num % itr == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}
