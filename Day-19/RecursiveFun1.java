package Day19;

import java.util.Scanner;

public class RecursiveFun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        for(int itr=1;itr<=n;itr++){
            long prod = 1;
            for(int itr1=0;itr1<itr;itr1++){
                prod = (prod * count) % 1000000007;
                count++;
            }
            sum += prod;
            sum = sum % 1000000007;
        }
        System.out.println(sum);
        // system.out.println(fun(n));
        sc.close();
    }
    // public static long fun(int n){
    //     long fun = solution(n,1,0,1,1);
    //     return fun;
    // }
    // public static long solution(int num,int count,int sum,long prod,int itr){
    //     if(num==0){
    //         return num%1000000007;
    //     }
    //     for(int itr1=1;itr1<itr;itr1++){
    //         prod = (prod*count)%1000000007;
    //         count++;
    //     }
    //     sum += prod + solution(num-1, count, sum, 1, itr+1);
    //     return sum;
    // }
}
