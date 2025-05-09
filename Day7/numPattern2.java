package Day7;

import java.util.Scanner;

public class numPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++){
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }
            for(int num = 1; num <=line; num++){
                if(num%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
