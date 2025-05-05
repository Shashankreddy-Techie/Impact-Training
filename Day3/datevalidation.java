package Day3;

import java.util.Scanner;
public class datevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear){
            int [] daysInMonth = {31, isLeapYear ?29 :28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month < 1 || month > 12) {
                System.out.println("Invalid month.");
            } else if (day < 1 || day > daysInMonth[month - 1]) {
                System.out.println("Invalid day.");
            } else {
                System.out.println("Valid date: " );
            }
        }
        sc.close();
    }
}