package Day18;
public class hailstone {
    public static void main(String[] args) {
        int n = 7;
        hailstone(n);
    }
    public static void hailstone(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        if (n % 2 == 0) {
            hailstone(n / 2);
        } else {
            hailstone(3 * n + 1);
        }
    }
}
