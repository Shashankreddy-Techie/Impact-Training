package Day31;

import java.util.Scanner;

public class QueueProb1{
    private int front, rear, capacity;
    private int[] queue;
    public QueueProb1(int size){
        front = 0;
        rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    public void enqueue(int data){
        if(rear == capacity){
            System.out.println("queue is full");
            return;
        }
        queue[rear] = data;
        rear++;
    }
    public void dequeue(){
        if(front == rear){
            System.out.println("Queue is empty.");
            return;
        }
        for(int i=0;i<rear-1;i++){
            queue[i] = queue[i+1];
        }
        rear--;
    }
    public void display(){
        if(front==rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+' ');
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QueueProb1 q = new QueueProb1(n);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        sc.close();
    }
}
