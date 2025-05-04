package Day2;

public class sumofdigits2 {
    public static void main(String[] args) {
        int n = 428765;
        int lastdigit = n % 10;
        while(n>=100){
            n = n / 10;
        }
        int seconddigit = n % 10;
        System.out.println("Sum of last and second digit: " + (lastdigit + seconddigit));
    }
}
