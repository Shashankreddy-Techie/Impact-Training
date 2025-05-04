package Day2;

public class middigit2 {
    public static void main(String[] args) {
        int n = 42857;
        int temp = n;
        int count = 0;
        while(n > 0) {
            n /= 10; 
            count++; 
        }
        System.out.println(count);
        int middleIndex = (count / 2 + 1);
        System.out.println(middleIndex);
        while(count > middleIndex) {
            temp /= 10;
            count -= 1;
        }
        System.out.println(temp);
        int middleDigit = temp % 10;
        System.out.println("Middle digit: " + middleDigit);
    }
}
