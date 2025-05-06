package Day4;
import java.util.Scanner;
public class minMaxnoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int min = num,  max = num;
        int sum = 0, count =0;
        while(num!= -1){
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
            sum += num;
            count++;
            System.out.println("Enter a number:");
            num = sc.nextInt();
        }
        int avg = sum / count;
        System.out.println("Minimum: " + min);  
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
