package Day7;
import java.util.Scanner;

public class numPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1; 

        for (int line = 1; line <= n; line++) {
            if (line % 2 != 0) {
                for (int num1 = 0; num1 < n; num1++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                int start = num + n-1;
                for (int num1 = 0; num1 < n; num1++) {
                    System.out.print(start + " ");
                    start--;
                }
                num += n;
            }
            System.out.println();
        }
        sc.close();
    }
}
