public class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop());       // 30
        System.out.println("Top Now: " + s.peek());     // 20
    }
}
