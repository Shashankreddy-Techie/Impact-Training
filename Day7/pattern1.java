package Day7;
import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for the pattern:");
        int n = sc.nextInt();
        sc.close();
        for(int line =n;line>0;line--){
            for(int star=line;star>0;star--){
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-line);space++){
                System.out.print(" ");
            }
            for(int star=line;star>0;star--){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}