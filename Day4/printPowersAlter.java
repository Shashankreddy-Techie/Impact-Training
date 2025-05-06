package Day4;
import java.math.*;
import java.util.Scanner;

public class printPowersAlter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num =  sc.nextInt();
        int count=0;
        
        if(num %2==0){ 
            for(int i=0;i<num/2;i++){
                System.out.print((int)Math.pow(2, i)+" "+(int)Math.pow(3, i)+" ");
                // System.out.println((int)Math.pow(2, i));
                // System.out.println((int)Math.pow(3, i));
            }
        }else{
            for(int i=0;i<num/2;i++){
                System.out.print((int)Math.pow(2, i)+" "+(int)Math.pow(3, i)+" ");
                // System.out.println((int)Math.pow(2, i));
                // System.out.println((int)Math.pow(3, i));
                count++;
            }
            System.out.print((int)Math.pow(2,count));
        }
        sc.close();
    }
}