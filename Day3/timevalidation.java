package Day3;
import java.util.Scanner;
public class timevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in HH MM SS format: ");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        if (hours < 0 || hours > 23) {
            System.out.println("Invalid hours. Please enter a value between 0 and 23.");
        } else if (minutes < 0 || minutes > 59) {
            System.out.println("Invalid minutes. Please enter a value between 0 and 59.");
        } else if (seconds < 0 || seconds > 59) {
            System.out.println("Invalid seconds. Please enter a value between 0 and 59.");
        } else {
            System.out.println("Valid time: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));
        }
        /*
         * if(hours >=0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <=59)
         * 
         */
        sc.close();
    }
}
