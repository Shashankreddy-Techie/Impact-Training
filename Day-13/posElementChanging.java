package Day13;
import java.util.Scanner;
import java.lang.StringBuilder;
class posElementChanging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number :");
        int n = sc.nextInt();
        System.out.println("Enter the position to change :");
        int pos = sc.nextInt();
        int res = (n ^ pos);
        String ans = toBinary(res);
        System.out.println(ans);
        sc.close();
    }
    public static String toBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}