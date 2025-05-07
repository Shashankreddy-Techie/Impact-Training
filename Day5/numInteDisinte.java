package Day5;
import java.util.Scanner;
public class numInteDisinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while(n>0){
            int dig = (int) (n%10);
            System.out.print(dig+" ");
            n = n/10;
        }
    }
}