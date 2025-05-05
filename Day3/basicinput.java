package Day3;

import java.util.Scanner;

public class basicinput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = sc.nextInt();
    // int y = sc.nextInt();
    // System.out.printf("%+d",x);
    // x = x + y;
    // y = x - y;
    // x = x - y;
    // System.out.println("x = " + x + ", y = " + y);
    // System.out.println("Success is when your \"Signature\" becomes \"autograph\"");
    // if(x % 3 ==0){
    //     System.out.println("Divisible by 3");
    // } 
    // else {
    //     int remainder = x % 3;
    //     System.out.println("Not divisible by 2, remainder is " + remainder);
    // }
    
    if(x%3==0 && x%5==0){
        System.out.println("HIHELLO");
    }else if(x%3==0){
        System.out.println("HI");
    }else if(x%5==0){
        System.out.println("HELLO");
    }else{
        System.out.println("NONE");
    }
    sc.close();
  }  
}
