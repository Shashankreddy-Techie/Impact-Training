package Day4;
import java.util.Scanner;
public class switchCase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (DD MM YYYY) :");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int [] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumDays = 0;
        for(int i = 0; i < month - 1; i++) {
            sumDays += daysInMonth[i];
        }
        sumDays += day;
        System.out.println("Total number of days is:"+sumDays);
        sc.close();
    }
}
