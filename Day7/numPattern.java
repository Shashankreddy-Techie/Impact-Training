package Day7;
import java.util.Scanner;
public class numPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for(int space = 0; space < n - line; space++) {
                System.out.print(" ");
            }
            for (int num = 1; num<=line ; num++) {
                System.out.print(num );
            }
            for(int num = line-1;num>=1;num--){
                System.out.print(num);
            } 
            System.out.println();
        }
        sc.close();
    }
}
