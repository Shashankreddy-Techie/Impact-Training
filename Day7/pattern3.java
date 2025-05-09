package Day7;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for the pattern:");   
        int n = sc.nextInt();
        for(int line=n;line>=1;line--){
            for(int space=0;space<n-line;space++){
                System.out.print(" ");
            }
            for(int star=line;star>=1;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
