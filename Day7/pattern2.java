package Day7;
import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for the pattern:");
        int n = sc.nextInt();
        sc.close();
        for(int line =1;line<=n;line++){
            for(int star=1;star<=n;star++){
                if(line==1 || line==n || star==1 || star==n || line==star || line+star==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
        }
        System.out.println();
    }
    }
}