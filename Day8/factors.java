package Day8;
import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int num = sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         System.out.print(i+",");
        //     }
        // }
        // for(int i=1;i<=num/4;i++){
        //     if(num%i==0){
        //         int dig = num/i;
        //         System.out.println(i+"*"+dig+"="+num);
        //     }
        // }
        int sqrt = (int) Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                int dig = num/i;
                System.out.println(i+"*"+dig+"="+num);
            }
        }
        sc.close();
    }
}
