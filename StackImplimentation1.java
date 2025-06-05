class MyStack {
    int top;
    int maxSize;
    int[] stack;

    // Constructor
    MyStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // stack is empty
    }

    // Push
    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    // Pop
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // isEmpty
    boolean isEmpty() {
        return top == -1;
    }

    // isFull
    boolean isFull() {
        return top == maxSize - 1;
    }
}
